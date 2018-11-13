import java.io.*;

public class Act3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fichero=new FileOutputStream(new File("config.ini"));
        String linea;
        while ((linea=fichero.readLine())!=null)
            System.out.println(linea);
        fichero.close();

    }
}
