import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner UCLN = new Scanner(System.in);
        int a, b;
        System.out.println("nhap a!");
        a = UCLN.nextInt();

        System.out.println("nhap b!");
        b = UCLN.nextInt();

        if (a == 0 || b == 0) {
            System.out.println(" không có ƯCLN");
        } else {
            while (a != b) {
                if (a > b) {
                    a = a - b;
                    System.out.println("a là :" + a);
                } else if (a < b) {
                    b = b - a;
                    System.out.println("b là :" + b);
                }
            }
            System.out.println("ước chung lơn nhất của hai số là " + b);
        }
    }
}