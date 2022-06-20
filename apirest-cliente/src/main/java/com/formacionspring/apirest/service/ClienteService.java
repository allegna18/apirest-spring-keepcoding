package com.formacionspring.apirest.service;

import java.util.List;

import com.formacionspring.apirest.entity.Cliente;

public interface ClienteService {
	
	//metoddo para mostrar todos los clientes 
	public List <Cliente> mostrarTodos();
	
	//metodo oara mostrar un cliente por id 
	public Cliente mostrarPorId(Long id);
	
	//metodo para guardar cliente
	public Cliente guardar(Cliente cliente); 
	
	//metodo para borrar un cliente 
	public void borrar (Long id); 

}
