package Hibernate.Entity;
// Generated Oct 8, 2014 6:52:37 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ADDRESS generated by hbm2java
 */
public class BUSFEE implements java.io.Serializable {

    private Integer idBusFee;
    private String BUSNAME;
    private String VILLAGENAME;
    private String DRIVERNAME;
    private String DRIVERCELL;
    private String BUSNUMBER;
    private Float FARE;

    public BUSFEE() {
    }

    public Integer getIdBusFee() {
        return idBusFee;
    }

    public void setIdBusFee(Integer idBusFee) {
        this.idBusFee = idBusFee;
    }

    public String getBUSNAME() {
        return BUSNAME;
    }

    public void setBUSNAME(String BUSNAME) {
        this.BUSNAME = BUSNAME;
    }

    public String getVILLAGENAME() {
        return VILLAGENAME;
    }

    public void setVILLAGENAME(String VILLAGENAME) {
        this.VILLAGENAME = VILLAGENAME;
    }

    public String getDRIVERNAME() {
        return DRIVERNAME;
    }

    public void setDRIVERNAME(String DRIVERNAME) {
        this.DRIVERNAME = DRIVERNAME;
    }

    public String getDRIVERCELL() {
        return DRIVERCELL;
    }

    public void setDRIVERCELL(String DRIVERCELL) {
        this.DRIVERCELL = DRIVERCELL;
    }

    public String getBUSNUMBER() {
        return BUSNUMBER;
    }

    public void setBUSNUMBER(String BUSNUMBER) {
        this.BUSNUMBER = BUSNUMBER;
    }

    public Float getFARE() {
        return FARE;
    }

    public void setFARE(Float FARE) {
        this.FARE = FARE;
    }
    
}
