package Lab7_String;
import java.util.Scanner;
public class Number_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi so: ");
        String number = sc.nextLine();
        StringBuilder sb = new StringBuilder(number);
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }
        System.out.println("Chuoi so sau khi dinh dang: " + sb.toString());
        sc.close();
    }
}