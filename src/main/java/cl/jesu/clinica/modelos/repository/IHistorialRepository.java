package cl.jesu.clinica.modelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jesu.clinica.modelos.Entity.HistorialEntity;

public interface IHistorialRepository extends JpaRepository<HistorialEntity, Integer>{

}
