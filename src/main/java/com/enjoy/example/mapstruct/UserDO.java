package com.enjoy.example.mapstruct;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * Auto Created by IntelliJ IDEA.
 *
 * @author liutao
 * @since 2020/8/11
 */
@Data
@Accessors(chain = true)
public class UserDO {

    /** 用户编号 **/
    private Integer id;
    /** 用户名 **/
    private String username;
    /** 密码 **/
    private String password;

}
