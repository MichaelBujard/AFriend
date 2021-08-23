package com.virtue;

import java.util.Objects;

public class TheologicalVirtue {

    private boolean faith;
    private boolean hope;
    private boolean charity;

    public boolean isCharity() {
        return charity;
    }

    public boolean isFaith() {
        return faith;
    }

    public boolean isHope() {
        return hope;
    }

    public void setCharity(boolean charity) {
        this.charity = charity;
    }

    public void setFaith(boolean faith) {
        this.faith = faith;
    }

    public void setHope(boolean hope) {
        this.hope = hope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TheologicalVirtue)) return false;
        TheologicalVirtue that = (TheologicalVirtue) o;
        return faith == that.faith && hope == that.hope && charity == that.charity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(faith, hope, charity);
    }
}
