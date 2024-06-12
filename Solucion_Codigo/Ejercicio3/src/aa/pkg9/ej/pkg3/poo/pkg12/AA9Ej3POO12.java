package aa.pkg9.ej.pkg3.poo.pkg12;

public class AA9Ej3POO12 {

    public static void main(String[] args) {
        SMS sms1 = new SMS("0968665914", "0998027818", "Daniel", "Arnaut", "Hola");
        MMS mms1 = new MMS("0968665914", "0998027818", "Daniel", "Arnaut", "foto_OneOff.jpg");

        sms1.enviarMensaje();
        sms1.visualizarMensaje();

        mms1.enviarMensaje();
        mms1.visualizarMensaje();
    }
}
