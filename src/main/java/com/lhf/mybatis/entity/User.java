package com.lhf.mybatis.entity;

import javax.persistence.Column;

public class User {

    private Integer id;
    private String realName;
    @Column(name = "login_name")
    private String loginName;
    private String password;
    private String phone;
    private Integer lastLoginTime;
    private Integer status;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer deletedAt;
    private Long groupId;
    private String ddOpenId;
    private String ddUnionId;
    private Integer repassAt;
    private Integer inviteCodeEdit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Integer deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getDdOpenId() {
        return ddOpenId;
    }

    public void setDdOpenId(String ddOpenId) {
        this.ddOpenId = ddOpenId;
    }

    public String getDdUnionId() {
        return ddUnionId;
    }

    public void setDdUnionId(String ddUnionId) {
        this.ddUnionId = ddUnionId;
    }

    public Integer getRepassAt() {
        return repassAt;
    }

    public void setRepassAt(Integer repassAt) {
        this.repassAt = repassAt;
    }

    public Integer getInviteCodeEdit() {
        return inviteCodeEdit;
    }

    public void setInviteCodeEdit(Integer inviteCodeEdit) {
        this.inviteCodeEdit = inviteCodeEdit;
    }
}
