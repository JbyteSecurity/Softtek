package com.aprendec.dao;

import org.springframework.data.repository.CrudRepository;

import com.aprendec.model.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
