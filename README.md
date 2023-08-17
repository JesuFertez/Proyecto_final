# Proyecto_final
Proyecto de salida Bootcamp Full Stack Java 

### Requisitos del Proyecto
- Se necesita desarrollar una aplicación web para administrar las operaciones de una
clínica de salud. Esta debe ser construida utilizando el framework Spring y las
herramientas necesarias para establecer la comunicación con la Base de Datos en
MySQL.
Requisitos técnicos
- Utiliza el framework Spring MVC para el desarrollo de la aplicación.
- Utiliza una base de datos MySQL para almacenar la información utilizando el código
sql proporcionado.
- Utiliza el patrón de diseño MVC para organizar tu código de manera adecuada.
- Implementa controladores, servicios y repositorios necesarios para manejar las
operaciones mencionadas anteriormente.
- La aplicación debo contar con una API Rest.
- Configura la conexión a la base de datos MySQL y utiliza JPA (Java Persistence API)
u otra que estimes conveniente para interactuar con ella.
- Utiliza Thymeleaf o JSTL como motor de plantillas para renderizar las vistas HTML o
JSP.
- Utilizar Bootstrap para el desarrollo de la interfaz de la Aplicación.
- Todas las vistas deben ser responsivas aplicables a tres pantallas de tamaños
distintos.
- El trabajo debe ser realizado en un Repositorio Público Personal con Git (GitHub,
GitLab u otro), realizando commit’s durante el proceso de trabajo.

### Instrucciones
- Actividad 1: Consultas a la base de datos
Antes de proceder a armar la aplicación, debes validar que la base de datos se encuentra
en condiciones de ser utilizada, es por esto que se te solicitan realizar las siguientes
consultas en lenguaje SQL, las cuales debes agregar en el proyecto dentro de un Package
con el nombre de consultas.
#### Consulta 1
Se solicita mostrar el nombre de cada paciente y el nombre del doctor con el que tienen
una cita asignada.
#### Consulta 2
Se solicita una lista del Nombre y la Especialidad de todos los doctores que atendieron al
paciente “Juan Pérez”
#### Consulta 3
Se solicita una lista con el monto que factura cada doctor, ordenados alfabéticamente de
forma descendente, agrupados por el nombre del Doctor.
#### Consulta 4
Se solicita una lista que muestre por paciente, el diagnóstico y tratamiento que recibió en
su última cita. Ordenados de forma ascendente por el id del paciente.
Consulta 5
Se solicita una lista con la cantidad de pacientes que ha atendido cada doctor.

### Actividad 2: Algoritmo y Pruebas Unitarias
- Dentro de las posibles soluciones en la aplicación se está buscando mejorar el manejo del
cobro y los descuentos a cada paciente. Existirán dos formas para aplicar los diferentes
descuentos una que considera la edad del paciente y la otra que considera la especialidad
y los años de experiencia. Por tanto, el arquitecto del proyecto te solicita definir una interfaz
para poder llevar a cabo ambas estrategias.

### Actividad 3: API Rest
En este momento, debes construir la aplicación web con Spring, deberás crear las clases y
objetos correspondientes, los servicios, implementaciones y controladores (Rest)
necesarios para que esta aplicación pueda realizar un CRUD (Crear, Editar, Leer y Eliminar)
de Historias clínicas.
Implementa los endpoints correspondientes para cada una de estas acciones.
### Actividad 4: Web Dinámica
Para esta parte, utiliza el proyecto realizado anteriormente y construye los controladores
que permitan la integración con el frontend, puedes utilizar cualquiera de las herramientas
vistas en clases, JSP o Thymeleaf.
La vista debe mostrar el historial clínico de un paciente
- Buscador de Pacientes: Debe tener una barra de búsqueda, que permita buscar un
paciente por Id o por cualquier otro parámetro. Al realizar la búsqueda debe
aparecer una lista con todos los pacientes que coinciden con el parámetro de
búsqueda. Y el usuario podrá seleccionar un paciente para ver su Historia Clínica.
Podría ser un selector o un combobox.
- Historia Clínica: En el centro de la página y luego del buscador, debe aparecer una
lista con todas las visitas del paciente con los datos correspondientes: Fecha,
médico, síntomas, diagnóstico y tratamiento.
- Botones de acción: A un costado de los datos de la visita, debe haber un botón,
editar el cual será referencial.
### Enlace a Proyecto 
#### https://github.com/JesuFertez/Proyecto_final
