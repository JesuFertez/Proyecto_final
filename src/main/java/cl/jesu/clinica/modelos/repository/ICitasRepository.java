package cl.jesu.clinica.modelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jesu.clinica.modelos.Entity.CitasEntity;

public interface ICitasRepository extends JpaRepository<CitasEntity, Integer> {

}
