package espoch.edu.ec.raicespolinomio;

public class Polinomio {
    
    public final float a;
    public final float b;
    public final float c;
    public final float delta;
    public final String x1;
    public final String x2;
    
    public Polinomio(float a, float b, float c) throws Exception {  
        if (a == 0)
            throw new Exception("No es un polinomio de grado 2");
        
        if (a >= 100000 || b >= 100000 || c >= 100000)
            throw new Exception("Ingrese valores de 5 cifras");
        
        this.a = a;
        this.b = b;
        this.c = c;
        this.delta = (float) Math.pow(this.b,2)-(4*this.a*this.c);
        
        if(this.delta >= 0){
            this.x1 = String.valueOf((-b + Math.sqrt(this.delta))/(2*a));
            this.x2 = String.valueOf((-b - Math.sqrt(this.delta))/(2*a));
        }
        else {
            float real = -b / (2*a);
            float imaginario = (float) Math.sqrt(-this.delta) / (2*a);
            this.x1 = String.format("%.2f+(%.2fi)", real, imaginario);
            this.x2 = String.format("%.2f-(%.2fi)", real, imaginario);
        }
    }    
}
