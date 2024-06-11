package com.org.demoagenda.service;

import org.springframework.stereotype.Service;

@Service
public interface IServiceUsuario {

    int getLogin(String email, String password);
}
