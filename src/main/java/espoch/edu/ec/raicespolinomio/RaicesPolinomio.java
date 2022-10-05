package espoch.edu.ec.raicespolinomio;
import java.util.Scanner;
import java.io.InputStream;

public class RaicesPolinomio {

    static float a;
    static float b;
    static float c;
    
    public static void Ingreso(InputStream in)throws Exception{
        Scanner leer = new Scanner(in);
        try{
            System.out.print("Ingrese el valor de a: ");
            a = leer.nextFloat();
            System.out.print("Ingrese el valor de b: ");
            b = leer.nextFloat();
            System.out.print("Ingrese el valor de c: ");
            c = leer.nextFloat();
        }catch(Exception e) {
            throw new Exception("Ingrese solo numeros");
        }  
    }
    
    public static void main(String[] args) {
        try {
            Ingreso(System.in);
            Polinomio miPolinomio = new Polinomio(a, b, c);
            System.out.println("x1 = " + miPolinomio.x1);
            System.out.println("x2 = " + miPolinomio.x2);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}
