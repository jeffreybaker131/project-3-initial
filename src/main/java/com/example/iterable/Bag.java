package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Bag<T> implements Iterable<T>, Container<T> {

    private ArrayList<T> items;

    public Bag() {
        items = new ArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        Container.super.forEach(action);
    }

    @Override
    public Spliterator spliterator() {
        return Container.super.spliterator();
    }

}