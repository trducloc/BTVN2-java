import java.util.Scanner;

public class bai5a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập chuỗi: ");
        String str1 = sc.nextLine();

        System.out.println("Nhập ký tự cần tìm: ");
        char ch = sc.next().charAt(0);

        int firstIndex = str1.indexOf(ch);
        int lastIndex = str1.lastIndexOf(ch);

        System.out.println("Vị trí xuất hiện đầu tiên của ký tự " + ch + " là " + firstIndex);
        System.out.println("Vị trí xuất hiện cuối cùng của ký tự " + ch + " là " + lastIndex);

    }
}
