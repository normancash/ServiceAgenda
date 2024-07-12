package com.org.demoagenda.repository;

import com.org.demoagenda.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface IRepoAgenda extends JpaRepository<Agenda, UUID> {


    @Query("SELECT e FROM Agenda e where e.usuario.id = ?1")
    List<Agenda> getAgendaByUsuario(UUID idUsuario);


}
