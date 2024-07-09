package com.org.demoagenda.controller;

import com.org.demoagenda.model.Usuario;
import com.org.demoagenda.repository.IRepoUsuario;
import com.org.demoagenda.service.IServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
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

    @GetMapping("/all")
    public List<Usuario> getAll() {
        return repoUsuario.findAll();
    }

    @PostMapping("/create")
    public void create(@RequestBody Usuario usuario) {
        repoUsuario.save(usuario);
    }
}
