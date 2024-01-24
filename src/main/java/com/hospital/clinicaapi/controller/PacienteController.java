package com.hospital.clinicaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.clinicaapi.model.Paciente;
import com.hospital.clinicaapi.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@GetMapping
	public List<Paciente> listarPaciente(){
		return pacienteService.listarPaciente();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Paciente salvarPaciente(@RequestBody Paciente paciente) {
		return pacienteService.salvarPaciente(paciente);
	}
	
	@PutMapping
	public Paciente atualizarPaciente(@RequestBody Paciente paciente) {
		return pacienteService.atualizarPaciente(paciente);
	}
	
	@DeleteMapping
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void apagarPaciente(@RequestParam(name="id")Long id) {
		pacienteService.apagarPaciente(id);
	}
}
