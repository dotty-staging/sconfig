package beanconfig;

// Java object returns are fully specified and should be reverted
// in the future. See https://github.com/lampepfl/dotty/issues/7312
public class BooleansConfig {
    Boolean trueVal;
    Boolean trueValAgain;
    Boolean falseVal;
    Boolean falseValAgain;
    Boolean on;
    boolean off;

    public java.lang.Boolean getTrueVal() {
        return trueVal;
    }

    public void setTrueVal(Boolean trueVal) {
        this.trueVal = trueVal;
    }

    public Boolean getTrueValAgain() {
        return trueValAgain;
    }

    public void setTrueValAgain(Boolean trueValAgain) {
        this.trueValAgain = trueValAgain;
    }

    public java.lang.Boolean getFalseVal() {
        return falseVal;
    }

    public void setFalseVal(Boolean falseVal) {
        this.falseVal = falseVal;
    }

    public Boolean getFalseValAgain() {
        return falseValAgain;
    }

    public void setFalseValAgain(Boolean falseValAgain) {
        this.falseValAgain = falseValAgain;
    }

    public Boolean getOn() {
        return on;
    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    public boolean getOff() {
        return off;
    }

    public void setOff(boolean off) {
        this.off = off;
    }
}
