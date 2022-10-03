package espoch.edu.ec.raicespolinomio;
import java.util.Scanner;

public class RaicesPolinomio {

    static double a;
    static double b;
    static double c;
    
    public static void Ingreso()throws Exception{
        Scanner leer = new Scanner (System.in);
        try{
            System.out.print("Ingrese el valor de a: ");
            a = leer.nextDouble();
            System.out.print("Ingrese el valor de b: ");
            b = leer.nextDouble();
            System.out.print("Ingrese el valor de c: ");
            c = leer.nextDouble();
        }catch(Exception e) {
            throw new Exception("Ingrese solo numeros");
        }  
    }
    
    public static void main(String[] args) {
        try {
            Ingreso();
            Polinomio miPolinomio = new Polinomio(a, b, c);
            miPolinomio.CalcularRaiz();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    
}
