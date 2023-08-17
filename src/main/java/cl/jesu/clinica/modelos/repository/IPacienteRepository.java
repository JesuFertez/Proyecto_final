package cl.jesu.clinica.modelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jesu.clinica.modelos.Entity.PacienteEntity;

public interface IPacienteRepository extends JpaRepository<PacienteEntity, Integer>{

}
