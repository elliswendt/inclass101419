import java.util.Scanner;
public class assignment {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double r1;
        double r2;
        double r3;

        System.out.println("Enter 3 values for 3 circles' radius values: ");
        r1 = input.nextDouble();
        input.nextLine();
        r2 = input.nextDouble();
        input.nextLine();
        r3 = input.nextDouble();
        input.nextLine();
        Circle c1 = new Circle(r1);
        Circle c2 = new Circle(r2);
        Circle c3 = new Circle(r3);

        System.out.println("c1:");
        c1.computeRadius();
        System.out.println("c2:");
        c2.computeRadius();
        System.out.println("c3:");
        c3.computeRadius();
    }
}
