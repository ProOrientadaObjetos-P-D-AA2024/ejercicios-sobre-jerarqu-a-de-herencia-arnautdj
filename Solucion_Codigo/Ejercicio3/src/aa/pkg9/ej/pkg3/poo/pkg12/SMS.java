package aa.pkg9.ej.pkg3.poo.pkg12;

public class SMS extends Mensaje {

    private String mensajeTexto;

    public SMS(String remitente, String destinatario, String nombreRemitente, String nombreDestinatario, String mensajeTexto) {
        super(remitente, destinatario, nombreRemitente, nombreDestinatario);
        this.mensajeTexto = mensajeTexto;
    }

    public String getMensajeTexto() {
        return mensajeTexto;
    }

    public void enviarMensaje() {
        System.out.println("Enviando SMS de " + getRemitente() + " a " + getDestinatario() + ": " + mensajeTexto);
    }

    public void visualizarMensaje() {
        System.out.println("SMS de " + (getNombreRemitente() != null ? getNombreRemitente() : getRemitente()) + " a "
                + (getNombreDestinatario() != null ? getNombreDestinatario() : getDestinatario()) + ": " + mensajeTexto);
    }
}
