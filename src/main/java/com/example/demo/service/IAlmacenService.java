package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Almacen;


public interface IAlmacenService {

	//Metodos del CRUD
		public List<Almacen> listarAlmacens(); //Listar All 
		
		public Almacen guardarAlmacens(Almacen video);	//Guarda un Almacen CREATE
		
		public Almacen AlmacenXID(Long id); //Leer datos de un Almacen READ
		
		public Almacen actualizarAlmacen(Almacen video); //Actualiza datos del Almacen UPDATE
		
		public void eliminarAlmacen(Long id);// Elimina el Almacen DELETE
}
