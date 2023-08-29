import java.util.Scanner;

public class bai5b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String s = scanner.nextLine();

        System.out.println("Nhập chuỗi con cần tìm: ");
        String s1 = scanner.nextLine();

        System.out.println("Nhập chuỗi con thay thế: ");
        String s2 = scanner.nextLine();

        String newS = s.replace(s1,s2);
        System.out.println("Chuỗi mới là: " + newS);
    }
}
