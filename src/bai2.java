import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập giá trị của b: ");
        double b = sc.nextDouble();
        System.out.println("Nhập giá trị của c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c; //delta = b2-4ac

        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);
        String result = d < 0 ? "PT vô nghiệm" : d == 0 ? "PT có 1 nghiệm: " + x1 : "PT có 2 nghiệm phân biệt " + x1 + ", " + x2;
        System.out.println(result);
    }
}
