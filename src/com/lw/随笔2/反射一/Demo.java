package com.lw.随笔2.反射一;

public class Demo {
    //登录
    public boolean login(String name,String pwd){
        if("admin".equals(name) && "123".equals(pwd)){
            return true;
        }
        return false;
    }
    //退出
    public void logout(){
        System.out.println("系统已安全退出！");
    }
}
