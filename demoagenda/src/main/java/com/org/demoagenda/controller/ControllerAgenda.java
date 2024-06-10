package com.org.demoagenda.controller;

import com.org.demoagenda.model.Agenda;
import com.org.demoagenda.service.IServiceAgenda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class ControllerAgenda {

    @Autowired
    private IServiceAgenda serviceAgenda;

    @GetMapping("/all")
    public List<Agenda> getAll() {
        return serviceAgenda.getAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Agenda agenda) {
        serviceAgenda.create(agenda);
    }
}
