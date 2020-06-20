package com.javi.springboot.backend.mvc.models.dao;

import com.javi.springboot.backend.mvc.models.entity.Cliente;

import org.springframework.data.repository.CrudRepository;

public interface IclienteDAO extends CrudRepository<Cliente, Long> {
	

}