package com.personality;

import java.util.Objects;

public class Temperament {

    private boolean sanguine;
    private boolean choleric;
    private boolean melancholic;
    private boolean phlegmatic;

    public boolean isSanguine() {
        return sanguine;
    }

    public boolean isCholeric() {
        return choleric;
    }

    public boolean isMelancholic() {
        return melancholic;
    }

    public boolean isPhlegmatic() {
        return phlegmatic;
    }

    public void setSanguine(boolean sanguine) {
        this.sanguine = sanguine;
    }

    public void setCholeric(boolean choleric) {
        this.choleric = choleric;
    }

    public void setMelancholic(boolean melancholic) {
        this.melancholic = melancholic;
    }

    public void setPhlegmatic(boolean phlegmatic) {
        this.phlegmatic = phlegmatic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Temperament)) return false;
        Temperament that = (Temperament) o;
        return sanguine == that.sanguine && choleric == that.choleric && melancholic == that.melancholic && phlegmatic == that.phlegmatic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sanguine, choleric, melancholic, phlegmatic);
    }

}
