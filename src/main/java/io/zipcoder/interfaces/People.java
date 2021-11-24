package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{
    private final List<Person> personList;
    public People(){
        personList = new ArrayList<Person>();
    }
    public void add(Person p){
        this.personList.add(p);
    }
    public Person findById(long id){
        for(Person p: personList){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public boolean contains(Person o){
        for(Person p: personList){
            if(p.equals(o)){
                return true;
            }
        }
        return false;
    }
    public void remove(Person o){
        this.personList.remove(o);
    }
    public void removeAll(){
        this.personList.clear();
    }
    public int count(){
        return this.personList.size();
    }

    public Iterator<Person> iterator() {
        return this.personList.iterator();
    }

    public Person[] toArray(){
        return this.personList.toArray(new Person[0]);
    }
}
