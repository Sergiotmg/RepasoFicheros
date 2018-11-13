import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Act1 {
    private BufferedWriter fichero=new
            BufferedWriter(new FileWriter("socios.txt"));
    private Scanner tec=new Scanner(System.in);

    public Act1() throws IOException {
    }

    public static void main(String[] args) throws IOException {

        Scanner tec=new Scanner(System.in);
        Act1 a1=new Act1();
        a1.introSocio();


    }//fin main

    private void introSocio() throws IOException {

        System.out.println("Introduce id");
        int id=tec.nextInt();
        tec.nextLine();
        System.out.println("Introduce Nombre");
        String nombre=tec.nextLine();

        System.out.println("Introduce Apellido");
        String apellido=tec.nextLine();
        System.out.println("Introduce Ciudad ");
        String ciudad=tec.nextLine();

        fichero.write("ID: "+id);
        fichero.newLine();
        fichero.write("Nombre :"+nombre);
        fichero.newLine();
        fichero.write("Apellido: "+apellido);
        fichero.newLine();
        fichero.write("Ciudad :"+ciudad+"\n");
        fichero.newLine();
        fichero.write("");
        fichero.newLine();
        System.out.println("Pulsa s para añadir otro");
        char op=tec.next().charAt(0);
        if (op=='s') {
            introSocio();
        }

        //System.out.println("Fin introducción");
        fichero.close();
    }

}
