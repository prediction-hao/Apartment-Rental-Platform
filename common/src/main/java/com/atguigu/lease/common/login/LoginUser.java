package com.atguigu.lease.common.login;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author wanna
 * @create 2025 -05 -19 -11:09 PM
 */
@Data
@AllArgsConstructor
public class LoginUser {

    private Long userId;
    private String username;
}
