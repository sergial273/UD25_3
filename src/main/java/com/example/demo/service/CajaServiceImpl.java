package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajaDAO;
import com.example.demo.dto.Caja;

@Service
public class CajaServiceImpl implements ICajaService{

	@Autowired
	ICajaDAO iFabricanteDAO;
	
	@Override
	public List<Caja> listarCajas() {
		
		return iFabricanteDAO.findAll();
	}
	
	@Override
	public Caja guardarCajas(Caja video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public Caja CajaXID(Long id) {
		
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Caja actualizarCaja(Caja video) {
		
		return iFabricanteDAO.save(video);
	}

	@Override
	public void eliminarCaja(Long id) {
		
		iFabricanteDAO.deleteById(id);
		
	}
}
