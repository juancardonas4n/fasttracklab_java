# Laboratorio de programación (Sistema de registro de notas)

## Objetivo

1. Definir los casos de uso de los docentes, estudiantes y entidades administrativos

2. Definir el diagrama Entidad-Relación

3. Analizar el proyecto

4. En base a la análisis definir el diagrama de relación de Clases de modelo a proponer

5. Definir los servicios de la aplicación a partir del modelo propuesto

6. Implementar los servicios por medio del *Framework* Java Spring

## Descripción

Una Universidad (Politécnico o escuela) tiene un conjunto de carreras. Cada  de estas carreras esta definida por un pénsum.  La función del pénsum es establecer las materias que se debe ver en cada carrera o de otra manera el plan de estudios.  Una materia, dependiendo de la Universidad, se encuentra  definida por un nombre único (o al menos una forma de identificación única -el formato depende de la universidad), un área de conocimiento, un número de créditos (generalmente un valor 1 hasta un máximo - depende de cada universidad definirlo). Al inicio del período académico, dependiendo de las carreras registradas y su pénsum establecido, la parte administrativa de la Universidad se encarga de abrir uno o más cursos de cada una de las materias; una vez abierto un curso en particular este es signado a un docente encargado de impartirlo y evaluar la nota del estudiante. La función del docente, una vez asignado el curso, es registrar las evaluaciones que el curso tendrá. Una evaluación tiene básicamente un nombre único y un porcentaje del valor de la nota en la nota definitiva del curso. 

Antes de empezar el periodo académico, un docente registra las evaluaciones que tendrá dicho curso y durante el período académico registrar las notas obtenidas por los alumnos. El registro de una nota debe informar al alumno Los alumnos, pueden consultar desde el mismo inicio del período académico sus notas obtenidas en cada una de las evaluaciones presentadas a los diferentes cursos que se encuentra matriculados y al final obtener la nota definitiva para la materia dentro del pénsum que cada estudiante tiene al estar registrado en una carrera determinada.

* El pénsum sirve para definir las materias que una carrera tendrá.
* Cada materia dentro del pénsum definirá el número de créditos (NC), el nombre de la materia y el semestre (o período académico) en el cual debe ser visto.
* Se computa el total de créditos de una carrera (TCC), sumando todos los créditos de todas la materias en el pénsum.
* Por cada materia, se computa el porcentaje (P) que dicha materia aporta a la carrera $P = NC / TCC$.
* Cuando se crea una carrera se define el pénsum específico.
* Un período académico o semestre tiene varias partes: Inicio del semestre, donde se definen los cursos por materia, se asignan los docente (o profesores) a impartir la materia; período de semestre en curso donde se inician las clases por curso y comienzan a registrarse las notas; y terminación del semestre, donde se termina el semestre y se registra la nota obtenida por el estudiante, indicando si pasó o no.
* La parte administrativa, registra al principio del semestre los cursos y la asignación de docentes.
* Un docente una vez asignado a un curso establece las evaluaciones del curso, o cursos que tiene asignados. 
* Un docente registrara durante el período en curso las notas obtenidas por cada estudiante matriculado en los cursos.
* Un estudiante puede observa las notas registradas durante el período académico, ya se por que se le envié por correo electrónico, o las mire por el sistema.
* Un estudiante al final del período académico recibirá un correo electrónico indicado la aprobación o la reprobación del materia. También puede verificar la nota definitiva. 
* La Universidad a través del personal administrativo establece el final del período.
* El personal administrativo cierra formalmente el curso y sube el registro de notas definitivas por materia.
* En este proyecto, se mostrará el comportamiento por un semestre, se asumirá que las bases de datos de Pénsum, Materias, Docentes, Estudiantes ya se encuentra llenas y no se hará un trabajo específico en ellas



## Usuarios

* Estudiantes, reciben la información de cada nota registrada, mira las evaluaciones contenidas en cada curso matriculado y recibir confirmación de la nota final (Aprobó o reprobó)
* Profesores, asignan las evaluaciones a cada curso asignado. Donde cada evaluación tiene un porcentaje, también deberían tener una fecha determinada de la evaluación, pero por facilidad del proyecto se omitirá. También, tienen la función de registrar las notas.
*  Personal administrativo, registran las carreras, los correspondientes pénsums y el registro de nuevos estudiantes.