import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Act2 {
    public static void main(String[] args) throws IOException {
        BufferedReader fichero=new BufferedReader(new FileReader("socios.txt"));
        String linea;
        while ((linea=fichero.readLine())!=null)
            System.out.println(linea);
        fichero.close();

    }
}
