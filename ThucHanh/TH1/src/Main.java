import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner checkNumber = new Scanner(System.in);

        System.out.println("nhap vao 1 so bat ki");
        int soNguyenTo = checkNumber.nextInt();
        int count = 0;

        if (soNguyenTo >= 2) {
            for (int i = 1; i <= soNguyenTo; i++) {
                if (soNguyenTo % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(soNguyenTo + " la so nguyen to");
            } else {
                System.out.println(soNguyenTo + " k la so nguyen to");
            }
        } else {
            System.out.println("nhap lai 1 so lon hon hoac bang 2");
        }
    }
}