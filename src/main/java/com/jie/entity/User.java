package com.jie.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class User implements Serializable {
    /**
     * 内部id
     */
    private String uuid;

    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String mail;

    /**
     * 权限
     */
    private String role;

    /**
     * 是否启用
     */
    private String isout;

    /**
     * 创建时间
     */
    private Date ctime;

    /**
     * 修改时间
     */
    private Date utime;

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getIsout() {
        return isout;
    }

    public void setIsout(String isout) {
        this.isout = isout;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
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
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals( other.getUuid() ))
                && (this.getName() == null ? other.getName() == null : this.getName().equals( other.getName() ))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals( other.getPassword() ))
                && (this.getMail() == null ? other.getMail() == null : this.getMail().equals( other.getMail() ))
                && (this.getRole() == null ? other.getRole() == null : this.getRole().equals( other.getRole() ))
                && (this.getIsout() == null ? other.getIsout() == null : this.getIsout().equals( other.getIsout() ))
                && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals( other.getCtime() ))
                && (this.getUtime() == null ? other.getUtime() == null : this.getUtime().equals( other.getUtime() ));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getMail() == null) ? 0 : getMail().hashCode());
        result = prime * result + ((getRole() == null) ? 0 : getRole().hashCode());
        result = prime * result + ((getIsout() == null) ? 0 : getIsout().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        result = prime * result + ((getUtime() == null) ? 0 : getUtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( getClass().getSimpleName() );
        sb.append( " [" );
        sb.append( "Hash = " ).append( hashCode() );
        sb.append( ", uuid=" ).append( uuid );
        sb.append( ", name=" ).append( name );
        sb.append( ", password=" ).append( password );
        sb.append( ", mail=" ).append( mail );
        sb.append( ", role=" ).append( role );
        sb.append( ", isout=" ).append( isout );
        sb.append( ", ctime=" ).append( ctime );
        sb.append( ", utime=" ).append( utime );
        sb.append( ", serialVersionUID=" ).append( serialVersionUID );
        sb.append( "]" );
        return sb.toString();
    }
}