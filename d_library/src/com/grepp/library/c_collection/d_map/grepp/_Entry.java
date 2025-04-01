package com.grepp.library.c_collection.d_map.grepp;

import java.util.Objects;

public class _Entry<K, V> {

    private K key; // 중복 비허용
    private V value; // 중복 허용

    _Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    //key로 비교하게 오버라이딩(이렇게해야 중복된 셋이 안들어감)
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof _Entry<?, ?> entry)) {
            return false;
        }
        return Objects.equals(key, entry.key);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(key);
    }

    @Override
    public String toString() {
        return "{" +
            "key=" + key +
            ", value=" + value +
            '}';
    }
}
