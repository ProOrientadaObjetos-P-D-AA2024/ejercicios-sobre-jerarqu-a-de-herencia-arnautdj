package aa.pkg9.ej.pkg3.poo.pkg12;

public class MMS extends Mensaje {

    private String nombreFicheroImagen;

    public MMS(String remitente, String destinatario, String nombreRemitente, String nombreDestinatario, String nombreFicheroImagen) {
        super(remitente, destinatario, nombreRemitente, nombreDestinatario);
        this.nombreFicheroImagen = nombreFicheroImagen;
    }

    public String getNombreFicheroImagen() {
        return nombreFicheroImagen;
    }

    public void enviarMensaje() {
        System.out.println("Enviando MMS de " + getRemitente() + " a " + getDestinatario() + ": " + nombreFicheroImagen);
    }

    public void visualizarMensaje() {
        System.out.println("MMS de " + (getNombreRemitente() != null ? getNombreRemitente() : getRemitente()) + " a "
                + (getNombreDestinatario() != null ? getNombreDestinatario() : getDestinatario()) + ": " + nombreFicheroImagen);
    }

}
