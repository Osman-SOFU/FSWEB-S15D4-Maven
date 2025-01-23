package org.example;

import java.util.*;

public class WorkintechList extends ArrayList {
    List<String> myList = new ArrayList<>();

    @Override
    public boolean add(Object object) {
        if (!this.contains(object)){
            return super.add(object);
        }
        return false;
    }

    public void sort(){
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        sort();
        return super.remove(o);
    }
}
