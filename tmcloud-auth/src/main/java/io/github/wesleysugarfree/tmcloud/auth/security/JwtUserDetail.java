package io.github.wesleysugarfree.tmcloud.auth.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.github.wesleysugarfree.tmcloud.auth.enumtype.Age;
import io.github.wesleysugarfree.tmcloud.auth.enumtype.Gender;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;

public class JwtUserDetail implements UserDetails {
    private final int id;
    private final String phone;
    private final String password;
    private final String realName;
    private Collection<? extends GrantedAuthority> authorities;
    private final Gender gender;
    private final Age age;
    private final String identity;
    private final LocalDateTime lastPasswordResetDate;

    public JwtUserDetail(int id, String phone, String password, String realName,
                         Collection<? extends GrantedAuthority> authorities,
                         Gender gender, Age age, String identity,
                         LocalDateTime lastPasswordResetDate) {
        this.id = id;
        this.phone = phone;
        this.password = password;
        this.realName = realName;
        this.authorities = authorities;
        this.gender = gender;
        this.age = age;
        this.identity = identity;
        this.lastPasswordResetDate = lastPasswordResetDate;
    }

    /**
     * @return 返回分配给用户的角色列表
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return password;
    }

    @JsonIgnore
    @Override
    public String getUsername() {
        return phone;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }

    public int getId() {
        return id;
    }

    public Gender getGender() {
        return gender;
    }

    public Age getAge() {
        return age;
    }

    public String getIdentity() {
        return identity;
    }

    @JsonIgnore
    public LocalDateTime getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }
}
