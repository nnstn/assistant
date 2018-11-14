package com.nnstn.assistant.po;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String email;

    private String phoneno;

    private String sex;

    private String salt;

    private Date cretetime;

    private Date lastlogindate;

    private String lastloginip;

    private String lastloginemac;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public Date getCretetime() {
        return cretetime;
    }

    public void setCretetime(Date cretetime) {
        this.cretetime = cretetime;
    }

    public Date getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public String getLastloginemac() {
        return lastloginemac;
    }

    public void setLastloginemac(String lastloginemac) {
        this.lastloginemac = lastloginemac == null ? null : lastloginemac.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhoneno() == null ? other.getPhoneno() == null : this.getPhoneno().equals(other.getPhoneno()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getCretetime() == null ? other.getCretetime() == null : this.getCretetime().equals(other.getCretetime()))
            && (this.getLastlogindate() == null ? other.getLastlogindate() == null : this.getLastlogindate().equals(other.getLastlogindate()))
            && (this.getLastloginip() == null ? other.getLastloginip() == null : this.getLastloginip().equals(other.getLastloginip()))
            && (this.getLastloginemac() == null ? other.getLastloginemac() == null : this.getLastloginemac().equals(other.getLastloginemac()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhoneno() == null) ? 0 : getPhoneno().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getCretetime() == null) ? 0 : getCretetime().hashCode());
        result = prime * result + ((getLastlogindate() == null) ? 0 : getLastlogindate().hashCode());
        result = prime * result + ((getLastloginip() == null) ? 0 : getLastloginip().hashCode());
        result = prime * result + ((getLastloginemac() == null) ? 0 : getLastloginemac().hashCode());
        return result;
    }
}