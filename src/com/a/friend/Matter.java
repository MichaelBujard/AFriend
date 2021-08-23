package com.a.friend;

import java.util.Objects;

public class Matter {

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
        if (!(o instanceof Matter)) return false;
        Matter matter = (Matter) o;
        return alive == matter.alive;
    }

    @Override
    public int hashCode() {
        return Objects.hash(alive);
    }
}
