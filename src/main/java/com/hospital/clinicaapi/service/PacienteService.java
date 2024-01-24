package com.hospital.clinicaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.clinicaapi.model.Paciente;
import com.hospital.clinicaapi.repository.PacienteRepository;

@Service
public class PacienteService {
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public List<Paciente> listarPaciente(){
		return pacienteRepository.findAll();
	}
	
	public Paciente salvarPaciente(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public Paciente atualizarPaciente(Paciente paciente) {
		Paciente response = pacienteRepository.findById(paciente.getId()).get();
		if(response != null) {		
			paciente = pacienteRepository.save(paciente);
		}
		return paciente;
	}
	
	public void apagarPaciente(Long id) {
		Paciente response = pacienteRepository.findById(id).get();
		if(response != null) {
			pacienteRepository.deleteById(id);		
		}
	}
}
