package com.org.demoagenda.repository;

import com.org.demoagenda.model.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface IRepoAgenda extends JpaRepository<Agenda, UUID> {


}
