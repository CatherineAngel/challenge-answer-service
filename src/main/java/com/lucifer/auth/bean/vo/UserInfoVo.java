package com.lucifer.auth.bean.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @author ：yuz13
 * @date ：Created in 2022/3/11 14:49
 * @description：
 * @modified By：
 * @version: $
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel("用户信息类")
public class UserInfoVo {

    @NotNull
    @ApiModelProperty(name="userName",value = "用户名",required = true)
    private String userName;


}
