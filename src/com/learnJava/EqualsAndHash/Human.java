package com.learnJava.EqualsAndHash;

import java.util.Objects;

public class Human {

    private int id;
    private String name;

    public Human(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        final Human human = (Human) o;
        return id == human.id &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name); // u can also create custom hashcode to generate unique no.
    }
}
