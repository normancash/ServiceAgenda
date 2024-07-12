package com.org.demoagenda.service;

import com.org.demoagenda.model.Usuario;
import com.org.demoagenda.repository.IRepoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceUsuario implements IServiceUsuario {

    @Autowired
    private IRepoUsuario repoUsuario;
    @Override
    public Usuario getLogin(String email, String password) {
        return repoUsuario.getLogin(email,password);
    }
}
