package com.grupo5gPOS.interfaceServices; 

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.grupo5gPOS.models.FacturahasProducto;

@Service
public interface InterfaceFacturahasProductoService {
	
	public List<FacturahasProducto>listadoFacturahasProducto();
	
	public List<FacturahasProducto>listarProductosDetalle(int id);
	
	public int guardarFacturahasProducto(FacturahasProducto facturahasproducto);
	
	public void borrarFacturahasProducto();
	
	public Optional<FacturahasProducto>consultarFacturahasProducto(int id); 
}