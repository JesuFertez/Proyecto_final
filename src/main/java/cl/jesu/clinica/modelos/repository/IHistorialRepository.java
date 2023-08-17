package cl.jesu.clinica.modelos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cl.jesu.clinica.modelos.Entity.HistorialEntity;

public interface IHistorialRepository extends JpaRepository<HistorialEntity, Integer>{

	//@Query(nativeQuery=true, value="SELECT Pacientes.Nombre as 'Paciente', Doctores.Nombre as 'Doctor', H.Fecha_Cita, H.Sintomas, H.Diagnostico, H.Tratamiento\n"
		//	+ "from Pacientes inner join Historia_Clinica as H on Pacientes.ID = H.Paciente_ID  inner join Doctores on Doctores.ID = H.Doctor_ID\n"
		//	+ "where Pacientes.ID= (:id_paciente)")
	//List<HistorialEntity>findHistorial(@Param("id_paciente")int id);
	
	@Query(nativeQuery=true, value="SELECT * FROM Historia_Clinica where Paciente_ID = (:id_paciente)")
	List<HistorialEntity>findHistorialPaciente(@Param("id_paciente")int id);
	
}
