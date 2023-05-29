import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the a, b, c respectively = ");
         double a = input.nextDouble();
         double b = input.nextDouble();
         double c = input.nextDouble();


        QuadraticEquation q1 = new QuadraticEquation(a, b ,c);
     System.out.println("Discriminant of equation = " + q1.CalculateDiscriminant());

     if(q1.CalculateDiscriminant()>0){
         System.out.println("First root of equation = "+ q1.getRoot1());
         System.out.println("First root of equation = "+ q1.getRoot2());
     }
     else if(q1.CalculateDiscriminant()==0){
         System.out.println("There is 2 roots equal to each other");
         System.out.println("Root of equation = "+ q1.getRoot1());
     }
     else{
         System.out.println("There isn't real root of equation");
        }
    }
}