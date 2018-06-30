package io.github.jaredtan95.tmcloud.auth.rest.converter;

import com.google.common.base.Converter;
import io.github.jaredtan95.tmcloud.auth.domain.User;
import io.github.jaredtan95.tmcloud.auth.rest.vo.UserVo;
import org.springframework.stereotype.Component;

@Component
public class UserConverter extends Converter<User, UserVo> {
    @Override
    protected UserVo doForward(User user) {
        UserVo userVo = new UserVo();
        userVo.setId(user.getId());
        userVo.setUsername(user.getUsername());
        userVo.setPassword(user.getPassword());
        userVo.setNickName(user.getNickName());
        return userVo;
    }

    @Override
    protected User doBackward(UserVo userVo) {
        User user = new User();
        user.setId(userVo.getId());
        user.setUsername(userVo.getUsername());
        user.setPassword(userVo.getPassword());
        user.setNickName(userVo.getNickName());
        return user;
    }
}
