===========================================================
                PROYECTAMAX – FASE 3 (Java)
===========================================================

Autor: Francisco Javier Andrade Ruiz
Proyecto: ProyectaMax
Asignatura: Entornos de desarrollo
Actividad: Actividad Final: Entornos de desarrollo
Fecha: Junio 2026

-----------------------------------------------------------
1. DESCRIPCIÓN DEL PROYECTO
-----------------------------------------------------------

ProyectaMax es un sistema de gestión de tareas al que se le 
ha añadido una nueva funcionalidad: generar y enviar una 
notificación automática cuando la prioridad de una tarea 
cambia a “Urgente”.

Esta entrega corresponde a la Fase 3 (Implementación), donde 
se desarrollan las clases Java basadas en los diagramas UML 
de la Fase 1 y los casos de prueba de la Fase 2.

-----------------------------------------------------------
2. ESTRUCTURA DEL PROYECTO
-----------------------------------------------------------

ProyectaMax/
│
└── src/
    └── main/
        └── java/
            └── proyectamax/
                ├── Main.java
                ├── Usuario.java
                ├── Tarea.java
                └── Notificacion.java

* La carpeta /bin no se incluye en el ZIP.
* Los archivos .classpath y .project son generados por Eclipse 
  y no son necesarios para la entrega.

-----------------------------------------------------------
3. DESCRIPCIÓN DE LAS CLASES
-----------------------------------------------------------

Usuario.java
------------
Representa al usuario asignado a una tarea. Contiene:
- idUsuario
- nombre
- email

Notificacion.java
-----------------
Clase creada en esta actividad. Gestiona la información de 
cada notificación generada:
- mensaje
- fechaEnvio
- destinatario (Usuario)

Tarea.java
----------
Clase principal de la lógica de negocio. Contiene:
- idTarea
- descripcion
- prioridad
- usuarioAsignado
- lista de notificaciones

Incluye el método cambiarPrioridad(), que genera una 
notificación cuando la prioridad pasa a “Urgente”.

Main.java
---------
Clase de prueba para demostrar el funcionamiento del sistema.

-----------------------------------------------------------
4. INSTRUCCIONES DE EJECUCIÓN
-----------------------------------------------------------

1. Importar el proyecto en Eclipse como "Existing Java Project".
2. Abrir la clase Main.java.
3. Ejecutar como "Java Application".
4. Observar en consola la simulación del envío de notificaciones.

-----------------------------------------------------------
5. NOTAS FINALES
-----------------------------------------------------------

- El envío de correo está simulado mediante mensajes en consola.
- La implementación sigue las buenas prácticas de encapsulación.
- El diseño está alineado con los diagramas UML de la Fase 1.
- Los casos de prueba de la Fase 2 se cumplen correctamente.

===========================================================
