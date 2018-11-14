

import java.io.*;

public class Act3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileout=new FileOutputStream(new File("config.dat"));
        DataOutputStream dataOS=new DataOutputStream(fileout);
        String linea;
        dataOS.writeUTF("Idioma: spanish\n");
        dataOS.writeUTF("Resolución: 1920x1080 \n");

        dataOS.writeUTF("Pantalla completa:\n");
        dataOS.writeUTF("Interfaz: principiante/avanzada\n");


    }
}
