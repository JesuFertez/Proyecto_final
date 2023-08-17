package cl.jesu.clinica.modelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jesu.clinica.modelos.Entity.FacturaEntity;

public interface IFacturaRepository extends JpaRepository<FacturaEntity, Integer> {

}
