package com.hospital.clinicaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.clinicaapi.model.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
