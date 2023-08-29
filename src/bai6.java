import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập độ dài cạnh thứ nhất của tam giác vuông: ");
        float d = sc.nextFloat();

        System.out.println("Nhập độ dài cạnh thứ hai của tam giác vuông: ");
        float k = sc.nextFloat();

        System.out.println("Nhập độ dài cạnh huyền của tam giác vuông: ");
        float h = sc.nextFloat();

        double sin = (double)d/h ;
        double rounded1 = Math.round(sin * 100.0) / 100.0;

        double cos = (double) k/h;
        double rounded2 = Math.round(cos * 100.0) / 100.0;
        System.out.println("sin = " + rounded1);

        System.out.println("cos = " + rounded2);

    }
}
