package com.weecoding.service.form;

import com.weecoding.service.model.User;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 * 用户的form表单
 * @author : wee
 * @version : v todo
 * @Date 2019-07-10  16:42
 */
@Data
public class UserForm extends User {

    /**
     * 重复密码
     */
    private String rePassword;

}
