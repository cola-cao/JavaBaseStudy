package com.example.jzoffer;

/**
 * @Author: cola
 * @Created: cola on 2021/3/16 11:27
 * @Version 1.0
 */
public interface MapLe<K,V> {

    /**
     * @return the key corresponding to this entry
     */
    K getKey();

    /**
     * @param key
     */
    void setKey(K key);

    /**
     * @return the value corresponding to this entry
     */
    V getValue();

    /**
     * @param value
     */
    void setValue(V value);



}
