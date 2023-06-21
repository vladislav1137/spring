package com.example.spring.controller;

import com.example.spring.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/store/order")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> id) {
        service.add(id);
    }

    @GetMapping("/get")
    public Collection<Integer> get() {
        return service.get();
    }
}
