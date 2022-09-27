import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tienLai = new Scanner(System.in);

        System.out.println("Nhập số tiền gửi!");
        float money = tienLai.nextFloat();

        System.out.println("Nhập lãi suất % tren năm !");
        float laiSuat = tienLai.nextFloat();

        System.out.println("Nhập số tháng muốn gửi!");
        int time = tienLai.nextInt();

        double tong = 0;

        for (int i = 0; i < time; i++) {
            tong += money * (laiSuat / 12) * time;
        }
        System.out.println("số tiền lãi nhận đc sau " + time + " tháng là : " + tong + " vnd");
    }
}