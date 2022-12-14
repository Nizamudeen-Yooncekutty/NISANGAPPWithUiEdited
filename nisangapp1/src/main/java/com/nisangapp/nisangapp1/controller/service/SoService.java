package com.nisangapp.nisangapp1.controller.service;

import java.util.List;

import com.nisangapp.nisangapp1.entity.SO;

public interface SoService {

	List<SO> getALLSo();
	SO saveSo(SO so);
	
	SO getSoById(Long id);
	
	SO updateSo(SO so);
	
	void deleteSoById(Long id);

}
