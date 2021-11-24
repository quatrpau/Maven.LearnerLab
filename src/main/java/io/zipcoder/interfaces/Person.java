package io.zipcoder.interfaces;

import java.util.Objects;

public class Person {
    private final long id;
    private String name;
    public Person(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || o.getClass() != getClass()) return false;
        Person op = getClass().cast(o);
        return this.name.equals(op.getName()) && this.id == op.getId();
    }
}
