package com.javi.springboot.backend.mvc.models.services;

import java.util.List;

import com.javi.springboot.backend.mvc.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public void save(Cliente proyecto);
	
	public Cliente findById (Long id);
	
	public void delete(Long id);

}
