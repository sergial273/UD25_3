package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Caja;


public interface ICajaService {

	//Metodos del CRUD
		public List<Caja> listarCajas(); //Listar All 
		
		public Caja guardarCajas(Caja video);	//Guarda un Caja CREATE
		
		public Caja CajaXID(Long id); //Leer datos de un Caja READ
		
		public Caja actualizarCaja(Caja video); //Actualiza datos del Caja UPDATE
		
		public void eliminarCaja(Long id);// Elimina el Caja DELETE
}
