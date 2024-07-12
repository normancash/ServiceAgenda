package com.org.demoagenda.service;

import com.org.demoagenda.model.Usuario;
import org.springframework.stereotype.Service;

@Service
public interface IServiceUsuario {

    Usuario getLogin(String email, String password);
}
