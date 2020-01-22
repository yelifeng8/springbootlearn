package com.ylf.springboot.learn.demo09.ehcache.ehcache;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public class MapEhcaChe<K, V> {
    private Map<K, V> ehcaCheMap = new ConcurrentHashMap<K, V>();

    public void put(K k, V value) {
        ehcaCheMap.put(k, value);
    }

    public V get(K k) {
        return ehcaCheMap.get(k);
    }

    public void remove(K k) {
        ehcaCheMap.remove(k);
    }
}
