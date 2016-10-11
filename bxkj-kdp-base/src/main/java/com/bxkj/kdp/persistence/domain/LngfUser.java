package com.bxkj.kdp.persistence.domain;

import com.bxkj.kdp.persistence.Domain;
import java.util.Date;

public class LngfUser extends Domain {
    private Integer id;

    private String rybs;

    private String rymc;

    private String bmbs;

    private String sjhm;

    private String dzyx;

    private String imzh;

    private String xb;

    private String sfyx;

    private Date lastUpdatedStamp;

    private Date lastUpdatedTxStamp;

    private Date createdStamp;

    private Date createdTxStamp;

    private String validateFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRybs() {
        return rybs;
    }

    public void setRybs(String rybs) {
        this.rybs = rybs == null ? null : rybs.trim();
    }

    public String getRymc() {
        return rymc;
    }

    public void setRymc(String rymc) {
        this.rymc = rymc == null ? null : rymc.trim();
    }

    public String getBmbs() {
        return bmbs;
    }

    public void setBmbs(String bmbs) {
        this.bmbs = bmbs == null ? null : bmbs.trim();
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm == null ? null : sjhm.trim();
    }

    public String getDzyx() {
        return dzyx;
    }

    public void setDzyx(String dzyx) {
        this.dzyx = dzyx == null ? null : dzyx.trim();
    }

    public String getImzh() {
        return imzh;
    }

    public void setImzh(String imzh) {
        this.imzh = imzh == null ? null : imzh.trim();
    }

    public String getXb() {
        return xb;
    }

    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }

    public String getSfyx() {
        return sfyx;
    }

    public void setSfyx(String sfyx) {
        this.sfyx = sfyx == null ? null : sfyx.trim();
    }

    public Date getLastUpdatedStamp() {
        return lastUpdatedStamp;
    }

    public void setLastUpdatedStamp(Date lastUpdatedStamp) {
        this.lastUpdatedStamp = lastUpdatedStamp;
    }

    public Date getLastUpdatedTxStamp() {
        return lastUpdatedTxStamp;
    }

    public void setLastUpdatedTxStamp(Date lastUpdatedTxStamp) {
        this.lastUpdatedTxStamp = lastUpdatedTxStamp;
    }

    public Date getCreatedStamp() {
        return createdStamp;
    }

    public void setCreatedStamp(Date createdStamp) {
        this.createdStamp = createdStamp;
    }

    public Date getCreatedTxStamp() {
        return createdTxStamp;
    }

    public void setCreatedTxStamp(Date createdTxStamp) {
        this.createdTxStamp = createdTxStamp;
    }

    public String getValidateFlag() {
        return validateFlag;
    }

    public void setValidateFlag(String validateFlag) {
        this.validateFlag = validateFlag == null ? null : validateFlag.trim();
    }
}