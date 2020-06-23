package com.javi.springboot.backend.mvc.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.javi.springboot.backend.mvc.models.entity.Cliente;
import com.javi.springboot.backend.mvc.models.services.IClienteService;

@CrossOrigin
@RestController
@RequestMapping("/api")

public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	// Request GET todos los clientes
	@GetMapping("/proyectos")
	public List<Cliente> index(){
		return clienteService.findAll();
	}
	
	// Request GET de un clientes
	@GetMapping("/proyectos/{id}")
	public Cliente index(@PathVariable Long id){
		return clienteService.findById(id);
	}
	
	
	
	
	@PostMapping("/proyectos")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente create(@RequestBody Cliente proyecto) {
		proyecto.setCreateAt(new Date());
		clienteService.save(proyecto);
		return proyecto;
	}
	
	// Request DELETE borra un cliente a partir de su id
	@DeleteMapping("/proyectos/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		Cliente clienteActual = clienteService.findById(id);
		clienteService.delete(clienteActual.getId());
	}
	
	
	@PutMapping("/proyectos/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente update(@RequestBody Cliente proyecto, @PathVariable Long id) {
		
		Cliente clienteActual = clienteService.findById(id);
		clienteActual.setReferencia(proyecto.getReferencia());
		clienteActual.setTitulo(proyecto.getTitulo());
		clienteActual.setTipo(proyecto.getTipo());
		clienteActual.setZonificacion(proyecto.getZonificacion());
		clienteActual.setCatastro(proyecto.getCatastro());
		clienteActual.setCliente(proyecto.getCliente());
		clienteActual.setUbicacion(proyecto.getUbicacion());
		clienteActual.setComercial(proyecto.getComercial());
		clienteActual.setFases(proyecto.getFases());
		clienteActual.setPresupuesto(proyecto.getPresupuesto());
		clienteActual.setActivo(proyecto.isActivo());
		clienteService.save(clienteActual);
		return clienteActual;
		
		
	}
	

}
