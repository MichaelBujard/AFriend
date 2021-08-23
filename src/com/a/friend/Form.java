package com.a.friend;

import com.virtue.*;

import java.util.Objects;

public class Form {

    HumanVirtue humanVirtue = new HumanVirtue();

    TheologicalVirtue theologicalVirtue = new TheologicalVirtue();

    private boolean alive;

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Form)) return false;
        Form form = (Form) o;
        return alive == form.alive && Objects.equals(humanVirtue, form.humanVirtue) && Objects.equals(theologicalVirtue, form.theologicalVirtue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanVirtue, theologicalVirtue, alive);
    }
}
