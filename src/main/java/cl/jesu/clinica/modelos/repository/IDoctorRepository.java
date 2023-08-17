package cl.jesu.clinica.modelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jesu.clinica.modelos.Entity.DoctorEntity;

public interface IDoctorRepository extends JpaRepository<DoctorEntity, Integer> {

}
