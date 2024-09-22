package com.grupo5gPOS.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.grupo5gPOS.models.Factura;

@Repository
public interface FacturaInterface extends JpaRepository < Factura, Integer> {
	
	@Query (value="SELECT MAX(id) FROM factura ", nativeQuery=true)
	int consultarUltimaFactura();
}
