package com.grupo5gPOS.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.grupo5gPOS.models.Usuario;

//Aquí van a estar los métodos del CRUD.
//Sería el equivalente al DAO en JSP.
public interface InterfaceUsuarioService {
	
public List<Usuario>listadoUsuario();
	
	public int guardarUsuario(Usuario us);
	
	public void borrarUsuario(int id);
	
	public Optional<Usuario>consultarUsuario(int id); //Editar o actualizar USUARIO.
	
	
}
 