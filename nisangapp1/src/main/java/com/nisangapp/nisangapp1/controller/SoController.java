package com.nisangapp.nisangapp1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nisangapp.nisangapp1.controller.service.SoService;
import com.nisangapp.nisangapp1.entity.SO;

@Controller
public class SoController {
	private SoService soService;

	public SoController(SoService soService) {
		super();
		this.soService = soService;
	}
	@GetMapping("/so")
	public String listSo(Model model) {
		model.addAttribute("sos", soService.getALLSo());
		return "sos";
	}
	
	@GetMapping("/so/new")
	public String createSoForm(Model model) {
		
		// create student object to hold student form data
		SO so = new SO();
		model.addAttribute("student", so);
		return "create_so";
		
	}
	
	@PostMapping("/so")
	public String saveStudent(@ModelAttribute("so") SO so) {
		soService.saveSo(so);
		return "redirect:/so";
	}
	
	@GetMapping("/so/edit/{id}")
	public String editSoForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", soService.getSoById(id));
		return "edit_so";
	}

	@PostMapping("/so/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("so") SO so,
			Model model) {
		
		// get student from database by id
		SO existingSo = soService.getSoById(id);
		existingSo.setId(id);
		existingSo.setHmDetails(so.getHmDetails());
		existingSo.setRequiredSkills(so.getRequiredSkills());
		existingSo.setRoleName(so.getRoleName());
		existingSo.setLocation(so.getLocation());
		existingSo.setJD(so.getJD());
		
		// save updated student object
		soService.updateSo(existingSo);
		return "redirect:/so";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/so/{id}")
	public String deleteSo(@PathVariable Long id) {
		soService.deleteSoById(id);
		return "redirect:/so";
	}

	
}
