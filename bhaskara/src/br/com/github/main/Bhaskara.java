package br.com.github.main;

public class Bhaskara {
    public double a;
    public double b;
    public double c;
    public double bPos;
    public double bNeg;


    public Bhaskara(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.bPos = bPos;
        this.bNeg = bNeg;

        this.classificacao(this.calcDelta( this.a, this.b, this.c));

        this.calcX( this.calcDelta( this.a, this.b, this.c));
    }

    public double calcDelta(double a, double b, double c) {
        double delta = (Math.pow(b,2)-(4*a*c));
        return delta;
    }
    public void calcX(double delta) {
        this.bPos = (((this.b*-1) + Math.sqrt(delta))/2*this.a);
        this.bNeg = (((this.b*-1) - Math.sqrt(delta))/2*this.a);
        System.out.println("B Positivo " + this.bPos);
        System.out.println("B Negativo " + this.bNeg);
    }
    public void classificacao(double delta) {
        if (delta< 0){
            System.out.println("A equação não possui raiz real");
        } else if(delta == 0) {
            System.out.println("A equação possui raiz real");
        } else {
            System.out.println("A equação possui duas raizes reais");
        }
    }
}
