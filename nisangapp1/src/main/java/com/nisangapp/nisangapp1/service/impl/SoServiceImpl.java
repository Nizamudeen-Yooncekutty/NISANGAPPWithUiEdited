package com.nisangapp.nisangapp1.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nisangapp.nisangapp1.controller.service.SoService;
import com.nisangapp.nisangapp1.entity.SO;
import com.nisangapp.nisangapp1.repository.SoRepository;

@Service
public class SoServiceImpl implements SoService  {
     
	private SoRepository soRepository;
	
	public SoServiceImpl(SoRepository soRepository) {
		super();
		this.soRepository = soRepository;
	}

	@Override
	public List<SO> getALLSo() {
		// TODO Auto-generated method stub
		return soRepository.findAll();
	}

	@Override
	public SO saveSo(SO so) {
		// TODO Auto-generated method stub
		return soRepository.save(so);
	}

	@Override
	public SO getSoById(Long id) {
		// TODO Auto-generated method stub
		return soRepository.findById(id).get();
	}

	@Override
	public SO updateSo(SO so) {
		// TODO Auto-generated method stub
		return soRepository.save(so);
	}

	@Override
	public void deleteSoById(Long id) {
		// TODO Auto-generated method stub
		soRepository.deleteById(id);
	}

}
