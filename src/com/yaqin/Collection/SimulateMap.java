package com.yaqin.Collection;

import java.util.HashMap;
import java.util.Map;

public class SimulateMap<K, V> {
    private final Map<K,V> map = new HashMap<K, V>();

    //add method, add value to map
    public synchronized void add(K key, V value) {
        if (map.containsKey(key)) {
            throw new IllegalStateException("A value for '"+key+"' is already present.");
        }

        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null.");
        }

        map.put(key, value);
    }

    //update a value in map
    public synchronized V update(K key, V value) {
        if (!map.containsKey(key)) {
            throw new IllegalStateException("There is no value to update for key '"+key+"'.");
        }

        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null.");
        }

        return map.put(key, value);
    }

    public synchronized V addOrUpdate(K key, V value) {
        if (value == null) {
            throw new IllegalArgumentException("Value cannot be null.");
        }

        return map.put(key, value);
    }

    public synchronized boolean remove(K key) {
        return map.remove(key) != null;
    }

    public synchronized boolean contains(K key) {
        return map.containsKey(key);
    }

    public synchronized V get(K key) {
        return map.get(key);
    }
}
