
import java.util.Scanner;


public class EDatosCaracol {

    public static void main(String[] args) {
        
         int p, s, r, contador = 0, estado = 0;

        Scanner leer = new Scanner(System.in);
        System.out.println("Dame p: ");  //10 por defecto
        p = leer.nextInt();
        
        System.out.println("Dame s: "); //5 por defecto
        s = leer.nextInt();
        
        System.out.println("Dame r: "); //2 por defecto
        r = leer.nextInt();

        do {
            estado = (estado + s);
            contador++;
            if (estado > 10) {
                break;
            } else {
                estado = estado - 2;
            }

        } while (estado <= p);

        System.out.println(contador);
    }

}
