package Hibernate.Entity;
// Generated Oct 8, 2014 6:52:37 PM by Hibernate Tools 3.2.1.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * FEEDETAILS generated by hbm2java
 */
public class STUDENTLEDGER implements java.io.Serializable {

    private Integer ID;
    private STUDENT STUDENT_ID;
    private FEEBREAKUP FEES_BREAKUP_ID;
    private float AMT;
    private float PENALTY;
    private float AMT_TO_PAY;
    private float AMT_TO_PAID;
    private Date DUE_DATE;
    private Date PAID_DATE;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public STUDENT getSTUDENT_ID() {
        return STUDENT_ID;
    }

    public void setSTUDENT_ID(STUDENT STUDENT_ID) {
        this.STUDENT_ID = STUDENT_ID;
    }

    public FEEBREAKUP getFEES_BREAKUP_ID() {
        return FEES_BREAKUP_ID;
    }

    public void setFEES_BREAKUP_ID(FEEBREAKUP FEES_BREAKUP_ID) {
        this.FEES_BREAKUP_ID = FEES_BREAKUP_ID;
    }

    public float getAMT() {
        return AMT;
    }

    public void setAMT(float AMT) {
        this.AMT = AMT;
    }

    public float getPENALTY() {
        return PENALTY;
    }

    public void setPENALTY(float PENALTY) {
        this.PENALTY = PENALTY;
    }

    public float getAMT_TO_PAY() {
        return AMT_TO_PAY;
    }

    public void setAMT_TO_PAY(float AMT_TO_PAY) {
        this.AMT_TO_PAY = AMT_TO_PAY;
    }

    public float getAMT_TO_PAID() {
        return AMT_TO_PAID;
    }

    public void setAMT_TO_PAID(float AMT_TO_PAID) {
        this.AMT_TO_PAID = AMT_TO_PAID;
    }

    public Date getDUE_DATE() {
        return DUE_DATE;
    }

    public void setDUE_DATE(Date DUE_DATE) {
        this.DUE_DATE = DUE_DATE;
    }

    public Date getPAID_DATE() {
        return PAID_DATE;
    }

    public void setPAID_DATE(Date PAID_DATE) {
        this.PAID_DATE = PAID_DATE;
    }

}
