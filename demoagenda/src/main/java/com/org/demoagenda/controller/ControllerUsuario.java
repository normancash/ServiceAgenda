package com.org.demoagenda.controller;

import com.org.demoagenda.model.Usuario;
import com.org.demoagenda.repository.IRepoUsuario;
import com.org.demoagenda.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class ControllerUsuario {

    @Autowired
    private IServiceUsuario serviceUsuario;

    @Autowired
    private IRepoUsuario repoUsuario;

    @PostMapping("/login")
    public Integer getLogin(@RequestParam("email") String email,
                                           @RequestParam("password") String password) {
        return serviceUsuario.getLogin(email,password);
    }

    @PostMapping("/create")
    public void create(@RequestBody Usuario usuario) {
        repoUsuario.save(usuario);
    }
}
