package Hibernate.Entity;
// Generated Oct 8, 2014 6:52:37 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ADDRESS generated by hbm2java
 */
public class ADDRESS implements java.io.Serializable {

    private Integer idAddress;
    private String address;
    private BUSFEE idBusFee;
    private String state;
    private String country;
    private int pinCode;
    private String remark;
    private String type;
    private Date lastUpdate;
    private Set STUDENTS = new HashSet(0);
//     private Set vendors = new HashSet(0);

    public ADDRESS() {
    }

    public Set getSTUDENTS() {
        return STUDENTS;
    }

    public void setSTUDENTS(Set STUDENTS) {
        this.STUDENTS = STUDENTS;
    }

    public ADDRESS(String address, BUSFEE city, String state, String country, int pinCode, String remark, String type, Date lastUpdate, Set pStudents, Set vendors) {
        this.address = address;
        this.idBusFee = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
        this.remark = remark;
        this.type = type;
        this.lastUpdate = lastUpdate;
        this.STUDENTS = pStudents;
    }

    public Integer getIdAddress() {
        return idAddress;
    }

    public void setIdAddress(Integer idAddress) {
        this.idAddress = idAddress;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BUSFEE getIdBusFee() {
        return idBusFee;
    }

    public void setIdBusFee(BUSFEE idBusFee) {
        this.idBusFee = idBusFee;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPinCode() {
        return this.pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
