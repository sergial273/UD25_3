package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

@Service
public class AlmacenServiceImpl implements IAlmacenService{

	@Autowired
	IAlmacenDAO iFabricanteDAO;
	
	@Override
	public List<Almacen> listarAlmacens() {
		
		return iFabricanteDAO.findAll();
	}
	
	@Override
	public Almacen guardarAlmacens(Almacen video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public Almacen AlmacenXID(Long id) {
		
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		
		iFabricanteDAO.deleteById(id);
		
	}
}

