import java.util.Scanner;

public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chiều dài của hình chữ nhật: ");
        float d = sc.nextFloat();

        System.out.println("Nhập chiều rộng của hình chữ nhật: ");
        float r = sc.nextFloat();

        float p = 2 * (d + r); //chu vi hinh chu nhat
        float s = d * r; //dien tich hinh chu nhat

        System.out.println("Chu vi của hình chữ nhật là: " + p);
        System.out.println("Diện tích của hình chữ nhật là: " + s);
    }
}





