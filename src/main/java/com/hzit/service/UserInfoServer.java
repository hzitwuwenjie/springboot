package com.hzit.service;

import com.github.pagehelper.PageHelper;
import com.hzit.dao.UserInfoDao;
import com.hzit.entity.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author 合众艾特信息技术有限公司-研发部-吴文杰
 * @Date 2018/8/1-18:17
 * @Description
 */
@Service
public class UserInfoServer {
    @Autowired
    private UserInfoDao userInfoDao;

    public List<Userinfo> findByPage(int page,int rowcount){
        PageHelper.startPage(page,rowcount);
        return userInfoDao.findAll();
    }
    @Transactional
    public int addUser(Userinfo userinfo){
        int m=userInfoDao.addUser(userinfo);
        userinfo=new Userinfo();
        return m+userInfoDao.addUser(userinfo);
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
