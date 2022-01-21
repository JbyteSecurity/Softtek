package com.aprendec.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.aprendec.commons.GenericServiceImpl;
import com.aprendec.dao.PersonaDao;
import com.aprendec.model.Persona;
import com.aprendec.service.PersonaService;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService {

	@Autowired(required=true)
	private PersonaDao personaDao;

	@Override
	public CrudRepository<Persona, Long> getDao() {
		return personaDao;
	}

}