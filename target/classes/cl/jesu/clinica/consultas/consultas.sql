-- Query 1 -- 
SELECT Pacientes.Nombre as "Nombre Paciente", Doctores.Nombre as "Nombre Doctor", 
Citas.Fecha as "Fecha de la cita" from Pacientes 
inner join Citas on Pacientes.ID = Citas.Paciente_ID 
inner join Doctores on Citas.Doctor_ID = Doctores.ID;

-- Query 2 --
SELECT Doctores.Nombre as "Nombre Doctor", Especialidades.Nombre  as "Especialidad" from Doctores inner join Especialidades
on Doctores.Especialidad_ID = Especialidades.ID inner join Historia_Clinica on Doctores.ID = Historia_Clinica.Doctor_ID
inner join Pacientes on Historia_Clinica.Paciente_ID= Pacientes.ID where Pacientes.Nombre= "Juan Pérez";

-- Query 3 --
SELECT Doctores.Nombre, SUM(Facturas.Monto) as total from Doctores inner join Citas
on Doctores.ID = Citas.Doctor_ID inner join Facturas on Citas.Factura_ID= Facturas.ID
group by Doctores.Nombre order by total desc;

-- query 4 -- 
-

-- Query 5 --


-- Este Join no funciono en @Query JPA / Aquí si lo hizo -- 
SELECT Pacientes.Nombre, Doctores.Nombre, H.Fecha_Cita, H.Sintomas, H.Diagnostico, H.Tratamiento
from Pacientes inner join Historia_Clinica as H on Pacientes.ID = H.Paciente_ID  inner join Doctores on Doctores.ID = H.Doctor_ID
where Pacientes.ID=1;













