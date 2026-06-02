package proyectamax;

public class Main {

    public static void main(String[] args) {

        // Crear un usuario de prueba
        Usuario usuario = new Usuario(
                1,
                "Francisco Javier Andrade Ruiz",
                "francisco.andrade@example.com"
        );

        // Crear una tarea asignada a ese usuario
        Tarea tarea = new Tarea(
                101,
                "Revisar informe mensual",
                "Media",
                usuario
        );

        // PRUEBA 1: Cambiar prioridad a Urgente → debe generar notificación
        System.out.println("---- PRUEBA 1 ----");
        tarea.cambiarPrioridad("Urgente");

        // PRUEBA 2: Cambiar prioridad a Baja → NO debe generar notificación
        System.out.println("\n---- PRUEBA 2 ----");
        tarea.cambiarPrioridad("Baja");

        // PRUEBA 3: Mantener prioridad en Urgente → genera otra notificación
        System.out.println("\n---- PRUEBA 3 ----");
        tarea.cambiarPrioridad("Urgente");
    }
}
