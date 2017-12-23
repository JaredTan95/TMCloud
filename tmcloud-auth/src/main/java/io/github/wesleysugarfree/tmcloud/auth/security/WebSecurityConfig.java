package io.github.wesleysugarfree.tmcloud.auth.security;

import io.github.wesleysugarfree.tmcloud.auth.security.filter.CustomCorsFilter;
import io.github.wesleysugarfree.tmcloud.auth.security.filter.JwtAuthenticationTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@SuppressWarnings("SpringJavaAutowiringInspection")
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtAuthenticationEntryPoint unauthorizedHandler;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Value("${jwt.route.authentication.path}")
    private String LOGIN_ENTRY_POINT;

    @Value("${jwt.route.registration.path}")
    private String REGISTER_ENTRY_POINT;


    @Autowired
    public void configureAuthentication(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(bCryptPasswordEncoder);
    }


    @Bean
    public JwtAuthenticationTokenFilter authenticationTokenFilterBean() {
        return new JwtAuthenticationTokenFilter();
    }


    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                //不需要CSR，关闭
                .csrf().disable()
                //设置自定义的权限不足响应类
                .exceptionHandling()
                .authenticationEntryPoint(unauthorizedHandler)
                //关闭session
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                //all front-end configuration
                .antMatchers(HttpMethod.POST, "/user-center/users/code").permitAll()
                .antMatchers(HttpMethod.GET, "/user-center/users/**").permitAll()
                .antMatchers(HttpMethod.POST, "/user-center/users").permitAll()
                .antMatchers(HttpMethod.POST, "/user-center/auth/token").permitAll()
                .antMatchers("/user-center/users/information").permitAll()
                .antMatchers(HttpMethod.POST, "/user-center/users/password").permitAll()
//                .antMatchers(HttpMethod.PUT, "/user-center/users").hasAnyAuthority("ADMIN", "USER")
//                .antMatchers(HttpMethod.PUT,"/user-center/users").hasAnyAuthority("USER")
                .antMatchers(HttpMethod.PUT, "/user-center/users/password").hasAnyAuthority("ADMIN", "USER")
                .antMatchers(HttpMethod.PUT, "/user-center/users").hasAnyAuthority("ADMIN", "USER")
                .antMatchers(HttpMethod.PUT, "/user-center/auth/token").hasAnyAuthority("ADMIN", "USER")
                .antMatchers(HttpMethod.GET, "/user-center/auth/authority").hasAnyAuthority("ADMIN", "USER")
                .antMatchers("/user-center/users/address").hasAnyAuthority("ADMIN", "USER")

                //all back-end configuration
                .antMatchers(HttpMethod.GET, "/user-center/users").hasAnyAuthority("ADMIN")
                //对于剩余权限，不需要验证
                .anyRequest().authenticated();

        // 设置自定义的filter
        httpSecurity
                .addFilterBefore(new CustomCorsFilter(), UsernamePasswordAuthenticationFilter.class)
                .addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class);

        // disable page caching
        httpSecurity.headers().cacheControl();
    }
}