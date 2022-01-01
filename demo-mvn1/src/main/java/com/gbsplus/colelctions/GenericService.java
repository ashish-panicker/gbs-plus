package com.gbsplus.colelctions;

import java.util.ArrayList;

public interface GenericService<T> {


    public void add(T obj);

    public void remove(T obj);

    public void update(T obj);

    public T get(T obj);

    public ArrayList<T> getAll();

    
}
