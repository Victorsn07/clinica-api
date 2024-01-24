package com.hospital.clinicaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.clinicaapi.model.Medico;
import com.hospital.clinicaapi.service.MedicoService;

@RestController
public class MedicoController {
	
	@Autowired
	private MedicoService medicoService;
	
	@GetMapping
	public List<Medico> listarMedicos(){
		return medicoService.listarMedicos();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void salvarMedicos(@RequestBody Medico medico) {
		medicoService.salvarMedicos(medico);
	}
	
	@PutMapping
	public Medico atualizarMedico(@RequestBody Medico medico) {
		return medicoService.atualizarMedicos(medico);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void apagarMedico(@RequestParam(name="id")Long id) {
		medicoService.apagarMedico(id);
	}
}
