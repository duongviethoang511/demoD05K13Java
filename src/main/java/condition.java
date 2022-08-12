import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
//        Nhập số nguyên a. Kiểm tra a là số âm hay dương.
//        Nếu a là số dương thì kiểm tra a có chẵn hay không.
//        Khai báo a
        int a;
        Scanner input = new Scanner(System.in);
//        Nhập a
        System.out.print("a = ");
        a = input.nextInt();
        if(a > 0){
            if(a % 2 == 0){
                System.out.println("a là số dương chẵn");
            } else {
                System.out.println("a là số dương lẻ");
            }
        } else if (a < 0) {
            System.out.println("a là số âm");
        } else {
            System.out.println("a là số không âm không dương");
        }
    }
}
