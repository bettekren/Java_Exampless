public class QuadraticEquation {
private double a, b, c;

    public QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }



public double  CalculateDiscriminant(){
return b*b-4*a*c;
}

public double getRoot1(){
        double root1 =  (-b + Math.sqrt(CalculateDiscriminant()))/ 2*a;
        return root1;

}

public double getRoot2(){
    double root2 =  (-b - Math.sqrt(CalculateDiscriminant()))/ 2*a;
    return root2;

}


}
