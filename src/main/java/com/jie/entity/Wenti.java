package com.jie.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class Wenti implements Serializable {
    private String uuid;

    /**
     * 所属话题
     */
    private String huati;

    /**
     * 问题
     */
    private String timu;

    private String neirong;

    /**
     * 所属用户
     */
    private String userid;

    /**
     * 创建时间
     */
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getHuati() {
        return huati;
    }

    public void setHuati(String huati) {
        this.huati = huati;
    }

    public String getTimu() {
        return timu;
    }

    public void setTimu(String timu) {
        this.timu = timu;
    }

    public String getNeirong() {
        return neirong;
    }

    public void setNeirong(String neirong) {
        this.neirong = neirong;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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
        Wenti other = (Wenti) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals( other.getUuid() ))
                && (this.getHuati() == null ? other.getHuati() == null : this.getHuati().equals( other.getHuati() ))
                && (this.getTimu() == null ? other.getTimu() == null : this.getTimu().equals( other.getTimu() ))
                && (this.getNeirong() == null ? other.getNeirong() == null : this.getNeirong().equals( other.getNeirong() ))
                && (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals( other.getUserid() ))
                && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals( other.getCtime() ));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getHuati() == null) ? 0 : getHuati().hashCode());
        result = prime * result + ((getTimu() == null) ? 0 : getTimu().hashCode());
        result = prime * result + ((getNeirong() == null) ? 0 : getNeirong().hashCode());
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getCtime() == null) ? 0 : getCtime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append( getClass().getSimpleName() );
        sb.append( " [" );
        sb.append( "Hash = " ).append( hashCode() );
        sb.append( ", uuid=" ).append( uuid );
        sb.append( ", huati=" ).append( huati );
        sb.append( ", timu=" ).append( timu );
        sb.append( ", neirong=" ).append( neirong );
        sb.append( ", userid=" ).append( userid );
        sb.append( ", ctime=" ).append( ctime );
        sb.append( ", serialVersionUID=" ).append( serialVersionUID );
        sb.append( "]" );
        return sb.toString();
    }
}