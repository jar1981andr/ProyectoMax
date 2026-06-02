package proyectamax;

import java.util.ArrayList;
import java.util.List;

public class Tarea {

    private int idTarea;
    private String descripcion;
    private String prioridad;
    private Usuario usuarioAsignado;
    private List<Notificacion> notificaciones;

    public Tarea(int idTarea, String descripcion, String prioridad, Usuario usuarioAsignado) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.usuarioAsignado = usuarioAsignado;
        this.notificaciones = new ArrayList<>();
    }

    public void cambiarPrioridad(String nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;

        if (nuevaPrioridad.equalsIgnoreCase("Urgente")) {
            generarNotificacion();
        }
    }

    private void generarNotificacion() {
        String mensaje = "La tarea '" + descripcion + "' ha sido marcada como URGENTE.";
        Notificacion notificacion = new Notificacion(mensaje, usuarioAsignado);
        notificaciones.add(notificacion);

        enviarCorreo(notificacion);
    }

    private void enviarCorreo(Notificacion notificacion) {
        System.out.println("Enviando correo a: " + notificacion.getDestinatario().getEmail());
        System.out.println("Mensaje: " + notificacion.getMensaje());
        System.out.println("Fecha de envío: " + notificacion.getFechaEnvio());
    }
}
