package com.virtue;

import java.util.Objects;

public class HumanVirtue {

    private boolean prudence;
    private boolean justice;
    private boolean temperance;
    private boolean fortitude;

    public boolean isPrudence() {
        return prudence;
    }

    public boolean isJustice() {
        return justice;
    }

    public boolean isTemperance() {
        return temperance;
    }

    public boolean isFortitude() {
        return fortitude;
    }

    public void setPrudence(boolean prudence) {
        this.prudence = prudence;
    }

    public void setJustice(boolean justice) {
        this.justice = justice;
    }

    public void setTemperance(boolean temperance) {
        this.temperance = temperance;
    }

    public void setFortitude(boolean fortitude) {
        this.fortitude = fortitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HumanVirtue)) return false;
        HumanVirtue that = (HumanVirtue) o;
        return prudence == that.prudence && justice == that.justice && temperance == that.temperance && fortitude == that.fortitude;
    }

    @Override
    public int hashCode() {
        return Objects.hash(prudence, justice, temperance, fortitude);
    }
}
