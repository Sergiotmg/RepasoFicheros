import java.io.*;
import java.nio.ByteBuffer;
import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) throws FileNotFoundException {
    File fichero =new File("ciudades.dat");
        RandomAccessFile file=new RandomAccessFile(fichero,"r");
        int id, posicion;
        byte[] idBytes=new byte[4];
        byte[] poblacionBytes=new byte[4];

        byte[] ciudad=new byte[40];
        byte[] pais=new byte[40];
        Scanner tec=new Scanner(System.in);
        System.out.println("Intro id de la ciudad");
        id=tec.nextInt();
        posicion=(id-1)*(4+40+4+40);

        try {
            file.seek(posicion);
            // para id de ciudad
            file.readFully(idBytes,0,idBytes.length);
            id= ByteBuffer.wrap(idBytes).getInt();//cojo el idbytes y lo paso int para imprimir

            //para ciudad
            file.readFully(ciudad,0,ciudad.length);
            String ciudadS=new String(ciudad);

            //para poblacion
            file.readFully(poblacionBytes,0,poblacionBytes.length);
            int poblacion=ByteBuffer.wrap(poblacionBytes).getInt();

            //para pais
            file.readFully(pais,0,pais.length);
            String paisS= new String(pais);

            System.out.println("ID: "+id+"\r\n"+"Ciudad :"+ciudadS+"\r\n Poblacion:"+poblacion+
                    "\r\n Pais: "+paisS);


        } catch (EOFException e) {
            System.out.println("No hay datos para dicho id");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}



