package com.example.jzoffer;

/**
 * @Author: cola
 * @Created: cola on 2021/3/16 11:38
 * @Version 1.0
 */
public class HashMapLe<K,V> implements MapLe {


    private K key;
    private V value;

    public HashMapLe(){

    }

    public HashMapLe(K key,V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }



    @Override
    public void setKey(Object key) {
        this.key = (K) key;

    }

    @Override
    public V getValue() {
        return this.value;
    }


    @Override
    public void setValue(Object value) {

        this.value = (V) value;

    }

    @Override
    public String toString() {
        return "HashMapLe{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
