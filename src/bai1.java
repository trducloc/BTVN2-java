import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Nhập vào số a: ");
        float a = sc.nextFloat();
        System.out.println("Nhập vào số b: ");
        float b = sc.nextFloat();

        float x = -b / a; //Neu a#0 thi phuong trinh co nghiem x=-b/a

        System.out.println("Nghiệm của phương trình là: " + x);
    }
}



