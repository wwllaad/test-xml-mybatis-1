package com.bve.model;

import java.util.Objects;

public class AbstractId {

    protected int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractId that = (AbstractId) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "AbstractId{" +
                "id=" + id +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {

        return id;
    }
}
