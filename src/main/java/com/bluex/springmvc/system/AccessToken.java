package com.bluex.springmvc.system;

/**
 * Created by Administrator on 2014/11/21.
 */
public class AccessToken {

    /**
     * 保存用户的 Token 及 UID
     * @param key   用户的 Token (随机 Hash)
     * @param value 用户的身份标识
     */
    public void setUserToken(String key,String value){

    }

    /**
     * 通过 Token 获取用户的身份标识
     * @param key 用户的 Token (随机 Hash)
     * @return　　用户的身份标识
     */
    public String getUserUID(String key){
        String UID = "";
        return UID;
    }

    /**
     * 延长用户 Token 的有效期
     * @param key 用户的 Token (随机 Hash)
     */
    public void prolongUserToken(String key){

    }

    /**
     * 删除用户的 Token
     * @param key 用户的 Token (随机 Hash)
     */
    public void deleteUserToken(String key){}

    /**
     * 生成一个随机 Token
     * @param str  字符串
     * @param salt 撒盐
     * @return
     */
    public String accessToken(String str,String salt){
        String accessToken = "";
        return accessToken;
    }
}
