import java.util.Scanner;

public class Chuyendoitien {
    public static void main(String[] args) {
        int VND = 23000 ;
        int USD;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số tiền UDS");
        USD = sc.nextInt();
        int quydoi=USD*23000;
        System.out.printf("gia tri VND"+quydoi);


     }
}