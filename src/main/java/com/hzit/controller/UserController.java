package com.hzit.controller;

import com.hzit.dao.UserInfoDao;
import com.hzit.entity.Userinfo;
import com.hzit.service.UserInfoServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/8/1-12:19
 * @Description
 */
@Controller
public class UserController {
    @Autowired
    private UserInfoServer server;

    @RequestMapping("/user")
    @ResponseBody
    public Object getUser(){
      return server.findByPage(1,10);
    }

    @RequestMapping("/adduser")
    @ResponseBody
    public Object adduser(Userinfo userinfo){
        return server.addUser(userinfo);
    }



}
/*
代码手中走~佛祖心中留！求永无BUG！
                   _ooOoo_
                  o8888888o
                  88" . "88
                  (| -_- |)
                  O\  =  /O
               ____/`---'\____
             .'  \\|     |//  `.
            /  \\|||  :  |||//  \
           /  _||||| -:- |||||-  \
           |   | \\\  -  /// |   |
           | \_|  ''\---/''  |   |
            \  .-\__  `-`  ___/-. /
          ___`. .'  /--.--\  `. . __
       ."" '<  `.___\_<|>_/___.'  >'"".
      | | :  `- \`.;`\ _ /`;.`/ - ` : | |
      \  \ `-.   \_ __\ /__ _/   .-` /  /
 ======`-.____`-.___\_____/___.-`____.-'======
 */
