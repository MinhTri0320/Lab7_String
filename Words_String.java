package Lab7_String;
import java.util.Scanner;
public class Words_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String n = sc.nextLine();
        n = n.trim();
        int c = 0;
        if (!n.isEmpty()) {
            String[] words = n.split("\\s+");
            c = words.length;
        }
        System.out.println("So tu trong chuoi la: " + c);
        sc.close();
    }
}