/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate.Entity;

import java.util.Date;

/**
 *
 * @author lrmakode
 */
public class STDNTBALSHEET {

    private Integer IdEntry;
    private STUDENT IDSTDNT;
    private STUDENTLEDGER IDSTDNTLDGR;
    private Float AMT;

    public STUDENTLEDGER getIDSTDNTLDGR() {
        return IDSTDNTLDGR;
    }

    public void setIDSTDNTLDGR(STUDENTLEDGER IDSTDNTLDGR) {
        this.IDSTDNTLDGR = IDSTDNTLDGR;
    }

    public Integer getIdEntry() {
        return IdEntry;
    }

    public void setIdEntry(Integer IdEntry) {
        this.IdEntry = IdEntry;
    }

    public STUDENT getIDSTDNT() {
        return IDSTDNT;
    }

    public void setIDSTDNT(STUDENT IDSTDNT) {
        this.IDSTDNT = IDSTDNT;
    }

    public Float getAMT() {
        return AMT;
    }

    public void setAMT(Float AMT) {
        this.AMT = AMT;
    }

}
