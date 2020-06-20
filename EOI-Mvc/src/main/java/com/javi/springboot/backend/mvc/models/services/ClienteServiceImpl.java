package com.javi.springboot.backend.mvc.models.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javi.springboot.backend.mvc.models.dao.IclienteDAO;
import com.javi.springboot.backend.mvc.models.entity.Cliente;

import jdk.nashorn.internal.runtime.FindProperty;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IclienteDAO clienteDao;
	
	@Override
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	@Transactional
	public void save(Cliente proyecto) {
		// TODO Auto-generated method stub
		clienteDao.save(proyecto);
	}

	@Override
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteDao.deleteById(id);
		
	}
	
		
	
	
	

}
