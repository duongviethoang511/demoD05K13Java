import java.util.Scanner;

public class exampleSwitchStatement {
    public static void main(String[] args) {
//        Cach 1
        int thang;
        Scanner input = new Scanner(System.in);
        System.out.print("n = ");
        thang = input.nextInt();
        if(thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12){
            System.out.println("Thang " + thang + " co 31 ngay");
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            System.out.println("Thang " + thang + " co 30 ngay");
        } else if (thang == 2) {
            int nam;
            System.out.print("nhap nam: ");
            nam = input.nextInt();
            if(nam % 4 == 0){
                System.out.println("Thang " + thang + " co 29 ngay");
            } else {
                System.out.println("Thang " + thang + " co 28 ngay");
            }
        } else {
            System.out.println("Nhap sai thang");
        }
//        Cach 2
        switch (thang) {
            case 1:;
            case 3:;
            case 5:;
            case 7:;
            case 8:;
            case 10:;
            case 12:
                System.out.println("Thang " + thang + " co 31 ngay");
                break;
            case 2:
                int nam;
                System.out.print("nhap nam: ");
                nam = input.nextInt();
                if(nam % 4 == 0){
                    System.out.println("Thang " + thang + " co 29 ngay");
                } else {
                    System.out.println("Thang " + thang + " co 28 ngay");
                }
                break;
            case 4:;
            case 6:;
            case 9:;
            case 11:
                System.out.println("Thang " + thang + " co 30 ngay");
                break;
            default:
                System.out.println("Nhap sai thang");
                break;
        }
    }
}
