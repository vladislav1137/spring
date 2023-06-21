package com.example.spring.service;

import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@SessionScope
@org.springframework.stereotype.Service
public class Service {
    private final Set<Integer> storage = new HashSet<>();

    public void add(List<Integer> id) {
        storage.addAll(id);
    }

    public Collection<Integer> get() {
        return Collections.unmodifiableSet(storage);
    }
}
