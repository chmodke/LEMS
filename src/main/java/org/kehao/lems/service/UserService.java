package org.kehao.lems.service;

import org.kehao.lems.entity.User;
import org.kehao.lems.utils.LEMSResult;

import java.io.UnsupportedEncodingException;

/**
 * Created by kehao on 2017/4/20.
 */
public interface UserService {
    LEMSResult getUserByUid(String uid);
    LEMSResult getUserByName(String name);
    LEMSResult validationUser(String name ,String passwd);
    LEMSResult checkLogin(String auther)throws UnsupportedEncodingException;
}
