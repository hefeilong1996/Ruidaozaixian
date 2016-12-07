package com.neusoft.ruidaozaixian.util.baseinfo;

/**
 * Created by 10127 on 2016/12/6.
 */
public class Connectinfo {
    //获取验证码
    private String identifyingCode = "http://www.neuedu.cn/imgcode";
    //登陆
    private String login = "http://www.neuedu.cn/m/mobileLogin!loginNeu.action";
    //退出登录
    private String logout ="http://www.neuedu.cn/m/mobileLogout!logoutNeu.action";
    //获取岗位列表
    private String obtainPosition="http://www.neuedu.cn/m/mobilePostInfo!findPostInfo.action";
    //获取岗位下课程
    private String obtainPositionClass ="http://www.neuedu.cn/m/mobilePostCourse!findPostCourse.action";
    //课程列表
    private String classList = "http://www.neuedu.cn/m/mobileCourseInfo!\n" +
            "findMoreMcourses.action\n";
    //自动登陆
    private String automaticLogin = "http://www.neuedu.cn/m/mobileAutoLogin!autoLogin.action";


}
