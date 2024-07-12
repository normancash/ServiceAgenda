package com.org.demoagenda.repository;

import com.org.demoagenda.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRepoUsuario extends JpaRepository<Usuario, UUID> {

    @Query("select e from Usuario e " +
            "where e.email = ?1 " +
            "and e.password = ?2")
    Usuario getLogin(String email,String password);

}
