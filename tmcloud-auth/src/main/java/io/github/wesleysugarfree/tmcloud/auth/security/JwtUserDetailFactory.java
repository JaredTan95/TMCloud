package io.github.wesleysugarfree.tmcloud.auth.security;

import io.github.wesleysugarfree.tmcloud.auth.entity.Role;
import io.github.wesleysugarfree.tmcloud.auth.entity.User;
import io.github.wesleysugarfree.tmcloud.auth.security.JwtUserDetail;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserDetailFactory {

    private JwtUserDetailFactory() {
    }

    /*
    * Long id, String phone, String password, String realName,
                         Collection<? extends GrantedAuthority> authorities,
                         Gender gender, Age age, String identity,
                         LocalDateTime lastPasswordResetDate*/
    public static JwtUserDetail create(User user) {
        return new JwtUserDetail(
                user.getId(),
                user.getPhone(),
                user.getPwd(),
                user.getRealName(),
                mapToGrantedAuthorities(user.getRole()),
                user.getGender(),
                user.getAge(),
                user.getIdentity(),
                user.getLastPasswordResetDate()
        );
    }

    private static List<GrantedAuthority> mapToGrantedAuthorities(List<Role> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getRole().name()))
                .collect(Collectors.toList());
    }
}