package com.hospital.clinicaapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.clinicaapi.model.Medico;
import com.hospital.clinicaapi.repository.MedicoRepository;

@Service
public class MedicoService {
	
	@Autowired
	private MedicoRepository medicoRepository;
	
	public List<Medico> listarMedicos(){
		return medicoRepository.findAll();
	}
	
	public Medico salvarMedicos(Medico medico) {
		return medicoRepository.save(medico);
	}
	
	public Medico atualizarMedicos(Medico medico) {
		Medico response = medicoRepository.findById(medico.getId()).get();
		if(response != null) {
			medico = medicoRepository.save(medico);
		}
		return medico;
	}
	
	public void apagarMedico(Long id){
		Medico response = medicoRepository.findById(id).get();
		if(response != null) {
			medicoRepository.deleteById(id);
		}
	}
}
