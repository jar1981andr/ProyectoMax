package proyectamax;

import java.time.LocalDateTime;

public class Notificacion {

    private String mensaje;
    private LocalDateTime fechaEnvio;
    private Usuario destinatario;

    public Notificacion(String mensaje, Usuario destinatario) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
        this.fechaEnvio = LocalDateTime.now();
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getFechaEnvio() {
        return fechaEnvio;
    }

    public Usuario getDestinatario() {
        return destinatario;
    }
}
