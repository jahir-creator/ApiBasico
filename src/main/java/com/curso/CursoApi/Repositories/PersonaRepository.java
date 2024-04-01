package com.curso.CursoApi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.curso.CursoApi.Entities.Persona;
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
