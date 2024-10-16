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
public class STUDENT {

    private Integer IdStudent;
    private String SSO;
    private String FIRST_NAME;
    private String MIDDLE_NAME;
    private String LAST_NAME;
    private String FATHERS_NAME;
    private String MOTHERS_NAME;

    private String CELL_1;
    private String CELL_2;
    private String AADHAR;

    private ADDRESS stdntAddress;
    private CLASS idClass;
    private Date DOB;

    public String getAADHAR() {
        return AADHAR;
    }

    public void setAADHAR(String AADHAR) {
        this.AADHAR = AADHAR;
    }

    @Override
    public String toString() {
        
        return IdStudent+" "+SSO+" "+FIRST_NAME+" "+MIDDLE_NAME +" "+ LAST_NAME+" "+FATHERS_NAME+" "+MOTHERS_NAME + " "+CELL_1
                +" "+ CELL_2+" "+stdntAddress+" "+DOB; //To change body of generated methods, choose Tools | Templates.
        
    }
    
    public String getMOTHERS_NAME() {
        return MOTHERS_NAME;
    }

    public void setMOTHERS_NAME(String MOTHERS_NAME) {
        this.MOTHERS_NAME = MOTHERS_NAME;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public CLASS getIdClass() {
        return idClass;
    }

    public void setIdClass(CLASS idClass) {
        this.idClass = idClass;
    }

    public String getFATHERS_NAME() {
        return FATHERS_NAME;
    }

    public void setFATHERS_NAME(String FATHERS_NAME) {
        this.FATHERS_NAME = FATHERS_NAME;
    }

    public String getCELL_1() {
        return CELL_1;
    }

    public void setCELL_1(String CELL_1) {
        this.CELL_1 = CELL_1;
    }

    public String getCELL_2() {
        return CELL_2;
    }

    public void setCELL_2(String CELL_2) {
        this.CELL_2 = CELL_2;
    }

    public ADDRESS getStdntAddress() {
        return stdntAddress;
    }

    public void setStdntAddress(ADDRESS stdntAddress) {
        this.stdntAddress = stdntAddress;
    }

    public Integer getIdStudent() {
        return IdStudent;
    }

    public void setIdStudent(Integer IdStudent) {
        this.IdStudent = IdStudent;
    }

    public String getSSO() {
        return SSO;
    }

    public void setSSO(String SSO) {
        this.SSO = SSO;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getMIDDLE_NAME() {
        return MIDDLE_NAME;
    }

    public void setMIDDLE_NAME(String MIDDLE_NAME) {
        this.MIDDLE_NAME = MIDDLE_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

}
