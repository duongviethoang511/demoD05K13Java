import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Nhập 2 số nguyên a, b. Tính tổng, hiệu, tích, thương
//        Khai báo 3 biến a, b, tong
        int a, b;
        int tong, hieu, tich;
        double thuong;
        Scanner input = new Scanner(System.in);
//        Nhập a
        System.out.print("a = ");
        a = input.nextInt();
//        Nhập b
        System.out.print("b = ");
        b = input.nextInt();
//        Tính tổng, hiệu, tích, thương
        tong = a + b;
        hieu = a - b;
        tich = a * b;
        thuong = (double) a / b;
//        Hiển thị tổng, hiệu, tích, thương
        System.out.println("tổng a + b = " + tong);
        System.out.println("hiếu a - b = " + hieu);
        System.out.println("tích a * b = " + tich);
        System.out.println("thuong a / b = " + thuong);
        boolean true_false = true;
        true_false = false;
    }
}
