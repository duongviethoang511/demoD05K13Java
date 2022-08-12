import java.util.Scanner;

import static java.lang.Math.sqrt;

public class example1Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.print("a = ");
        a = input.nextDouble();
        System.out.print("b = ");
        b = input.nextDouble();
        System.out.print("c = ");
        c = input.nextDouble();
        if(a == 0){
            if(b == 0) {
                if(c == 0){
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                double x = (-c) / b;
                System.out.println("Phuong trinh co nghiem: x = " + x);
            }
        } else {
            double delta = Math.pow(b,2) - 4 * a * c;
            if(delta < 0){
                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0){
                double x = (-b) / (2 * a);
                System.out.println("Phuong trinh co nghiem: x = " + x);
            } else {
                double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
                double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co nghiem: x1 = " + x1 + ", x2 = " + x2);
            }
        }

    }
}
