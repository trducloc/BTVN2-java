import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();

        double p = 2 * Math.PI * r; //chu vi
        double s = Math.PI * r*r; //dien tich

        System.out.printf("Chu vi của hình tròn là: %.3f\n", p);
        System.out.printf("Diện tích của hình tròn là: %.3f", s);
    }
}



