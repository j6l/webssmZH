package com.jie.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @author
 */
public class Huati implements Serializable {
    /**
     *
     */
    private String uuid;

    /**
     * 问题
     */
    private String wid;

    /**
     * 时间
     */
    private Date ctime;

    private static final long serialVersionUID = 1L;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getWid() {
        return wid;
    }

    public void setWid(String wid) {
        this.wid = wid;
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
        Huati other = (Huati) that;
        return (this.getUuid() == null ? other.getUuid() == null : this.getUuid().equals( other.getUuid() ))
                && (this.getWid() == null ? other.getWid() == null : this.getWid().equals( other.getWid() ))
                && (this.getCtime() == null ? other.getCtime() == null : this.getCtime().equals( other.getCtime() ));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUuid() == null) ? 0 : getUuid().hashCode());
        result = prime * result + ((getWid() == null) ? 0 : getWid().hashCode());
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
        sb.append( ", wid=" ).append( wid );
        sb.append( ", ctime=" ).append( ctime );
        sb.append( ", serialVersionUID=" ).append( serialVersionUID );
        sb.append( "]" );
        return sb.toString();
    }
}