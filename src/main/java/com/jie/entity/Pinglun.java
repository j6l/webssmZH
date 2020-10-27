package com.jie.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class Pinglun implements Serializable {
    private Integer intl;

    private String uuid;

    /**
     * 所属问题
     */
    private String wenti;

    /**
     * 内容
     */
    private String neirong;

    /**
     * 所属用户
     */
    private String user;

    /**
     * 做标记,是否提升到一楼
     */
    private Integer biaoji;

    /**
     * 创建时间
     */
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public Integer getIntl() {
        return intl;
    }

    public void setIntl(Integer intl) {
        this.intl = intl;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getWenti() {
        return wenti;
    }

    public void setWenti(String wenti) {
        this.wenti = wenti;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getBiaoji() {
        return biaoji;
    }

    public void setBiaoji(Integer biaoji) {
        this.biaoji = biaoji;
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
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
        Pinglun other = (Pinglun) that;
        return (this.getIntl() == null ? other.getIntl() == null : this.getIntl().equals( other.getIntl() ))
                && (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals( other.getUuid() ))
                && (this.getWenti() == null ? other.getWenti() == null : this.getWenti().equals( other.getWenti() ))
                && (this.getNeirong() == null ? other.getNeirong() == null : this.getNeirong().equals( other.getNeirong() ))
                && (this.getUser() == null ? other.getUser() == null : this.getUser().equals( other.getUser() ))
                && (this.getBiaoji() == null ? other.getBiaoji() == null : this.getBiaoji().equals( other.getBiaoji() ))
                && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals( other.getCtime() ));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIntl() == null) ? 0 : getIntl().hashCode());
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getWenti() == null) ? 0 : getWenti().hashCode());
        result = prime * result + ((getNeirong() == null) ? 0 : getNeirong().hashCode());
        result = prime * result + ((getUser() == null) ? 0 : getUser().hashCode());
        result = prime * result + ((getBiaoji() == null) ? 0 : getBiaoji().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( getClass().getSimpleName() );
        sb.append( " [" );
        sb.append( "Hash = " ).append( hashCode() );
        sb.append( ", intl=" ).append( intl );
        sb.append( ", uuid=" ).append( uuid );
        sb.append( ", wenti=" ).append( wenti );
        sb.append( ", neirong=" ).append( neirong );
        sb.append( ", user=" ).append( user );
        sb.append( ", biaoji=" ).append( biaoji );
        sb.append( ", ctime=" ).append( ctime );
        sb.append( ", serialVersionUID=" ).append( serialVersionUID );
        sb.append( "]" );
        return sb.toString();
    }
}