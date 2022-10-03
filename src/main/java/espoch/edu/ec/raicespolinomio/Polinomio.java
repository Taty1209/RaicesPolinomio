package espoch.edu.ec.raicespolinomio;

public class Polinomio {
    
    public double a;
    public double b;
    public double c;
    public double delta;
    public double x1;
    public double x2;
    
    public Polinomio(double a, double b, double c) throws Exception {
        if (a == 0)
            throw new Exception("No es un polinomio de grado 2");
        
        if (a >= 100000 || b >= 100000 || c >= 100000)
            throw new Exception("Ingrese valores de 5 cifras");
        
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = (double) Math.pow(this.b,2)-(4*this.a*this.c);
    }
    
    public void CalcularRaiz(){
        if(this.delta >= 0){
            this.x1 = (double) (-b + Math.sqrt(this.delta))/(2*a);
            this.x2 = (double) (-b - Math.sqrt(this.delta))/(2*a);
            System.out.printf("x1 = %.2f ", x1);
            System.out.printf("\nx2 = %.2f ", x2);
        }
        else {
            double real = -b / (2*a);
            double imaginario = Math.sqrt(-this.delta) / (2*a);
            System.out.printf("x1 = %.2f+%.2fi", real, imaginario);
            System.out.printf("\nx2 = %.2f-%.2fi", real, imaginario);
        }
    } 
    
}
