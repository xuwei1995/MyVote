package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import com.example.demo.util.Helper;
import com.example.demo.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.security.auth.Subject;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {
    @Autowired
    UserService userService;
    @RequestMapping("/login")
    public String main(){
        return "login";
    }
    @RequestMapping("/loginDo")
    @ResponseBody
    public Map<String,Object> login(HttpSession httpSession,User user){
        try {
            if(userService.selectByUserNumber(user.getUserNumber())==1)
            {
                user.setPassword(Md5Util.getMD5(user.getPassword()));
                 user=  userService.login(user);
                if(user!=null)
                {
                    httpSession.setAttribute("user", user);
                    return Helper.getInstance().successJsonResultMap(null,"您好,"+user.getUserName()+"欢迎登录");
                }else {
                    return Helper.getInstance().errorJsonResultMap("MSG002","密码错误");
                }
            }else {
                return Helper.getInstance().errorJsonResultMap("MSG001","用户名不存在");
            }
        }catch (Exception e)
        {
            return Helper.getInstance().errorJsonResultMap("SERVER_ERROR","服务器异常:"+e.getCause());
        }

    }
}
