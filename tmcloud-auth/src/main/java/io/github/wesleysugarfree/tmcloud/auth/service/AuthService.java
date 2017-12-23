
package io.github.wesleysugarfree.tmcloud.auth.service;

import io.github.wesleysugarfree.tmcloud.auth.entity.User;

public interface AuthService {
    User register(User userToAdd);
    String login(String username, String password);
    String refresh(String oldToken);
}