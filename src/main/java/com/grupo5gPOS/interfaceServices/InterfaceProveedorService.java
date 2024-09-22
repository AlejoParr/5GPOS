package com.grupo5gPOS.interfaceServices;

import java.util.List;
import java.util.Optional;

import com.grupo5gPOS.models.Proveedor;

public interface InterfaceProveedorService {
	
public List<Proveedor>listadoProveedor();
	
	public int guardarProveedor(Proveedor pr);
	
	public void borrarProveedor(int id);
	
	public Optional<Proveedor>consultarProveedor(int id); 
}
