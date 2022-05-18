package com.yqy.springdemo.data;


import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import lombok.Data;

@Data
@TableName("user")
public class LoginUser extends Wrapper<LoginUser> {
    private Integer id;
    private String username;
    private String password;

    public LoginUser() {
    }

    @Override
    public LoginUser getEntity() {
        return this;
    }

    @Override
    public MergeSegments getExpression() {
        return null;
    }

    @Override
    public void clear() {

    }

    public LoginUser(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public LoginUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getSqlSegment() {
        return null;
    }
}
