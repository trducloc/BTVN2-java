import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("Nhập ngày tháng năm sinh của bạn: ");
        String dateOfBirth = sc.nextLine();

        LocalDate today = LocalDate.now();

        LocalDate birthDate = LocalDate.parse(dateOfBirth, dateTimeFormatter);

        long age = ChronoUnit.YEARS.between(birthDate, today);
        System.out.println("Tuổi của bạn là: " + age + " tuổi.");
    }
}

