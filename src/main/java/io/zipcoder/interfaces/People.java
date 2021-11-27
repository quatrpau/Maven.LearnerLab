package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class People<E extends Person> implements Iterable<E>{
    protected final List<E> personList;
    public People(){
        personList = new ArrayList<E>();
    }
    public void add(E p){
        this.personList.add(p);
    }
    public E findById(long id){
        for(E p: personList){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    public boolean contains(E o){
        for(E p: personList){
            if(p.equals(o)){
                return true;
            }
        }
        return false;
    }
    public void remove(E o){
        this.personList.remove(o);
    }
    public void removeAll(){
        this.personList.clear();
    }
    public int count(){
        return this.personList.size();
    }

    public Iterator<E> iterator() {
        return this.personList.iterator();
    }
    public abstract E[] toArray();
}
