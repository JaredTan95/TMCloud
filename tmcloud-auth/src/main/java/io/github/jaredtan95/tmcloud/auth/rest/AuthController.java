package io.github.jaredtan95.tmcloud.auth.rest;


import io.github.jaredtan95.tmcloud.auth.domain.User;
import io.github.jaredtan95.tmcloud.auth.domain.enumtype.Authority;
import io.github.jaredtan95.tmcloud.auth.dto.BaseResult;
import io.github.jaredtan95.tmcloud.auth.rest.converter.UserConverter;
import io.github.jaredtan95.tmcloud.auth.rest.vo.UserVo;
import io.github.jaredtan95.tmcloud.auth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private UserConverter userConverter;

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public String getUsers() {
        return "{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Feynman\"}," +
                "{\"firstname\":\"Marie\",\"lastname\":\"Curie\"}]}";
    }


    @PostMapping("/register")
    public BaseResult<Object> UserRegistry(@RequestBody UserVo userVo) {

        User user = userConverter.reverse().convert(userVo);
        userService.registry(user, Authority.ROLE_USER);
        //TODO:生成token返回


        return new BaseResult<>().setContent(userVo);
    }


    @PostMapping("/login")
    public BaseResult<Object> login(@RequestBody UserVo userVo) {
        return new BaseResult<>().setContent(userVo);
    }
}
