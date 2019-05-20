package cn.net.lcy.operation.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping(value = "/login" )
public class LoginCotroller {

    /**
     * 登录
     *
     * @param id
     * @param password
     * @return
     */
    @RequestMapping(value = "/auth", method = RequestMethod.POST)
    public String submitLogin(String id, String password) {

        return "登录成功！";
    }
}
