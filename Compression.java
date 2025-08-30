package Lab7_string;
import java.util.Scanner;
public class Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi can nen: ");
        String n = sc.nextLine().trim();
        if (n.length()== 0) {
            System.out.println("Chuoi sau khi nen: ");
            return;
        }
        String r= "";
        char cu= n.charAt(0);
        int c = 1;
        for (int i = 1; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == cu) {
                c++;
            } else {
                r += cu + String.valueOf(c);
                cu = ch;
                c = 1;
            }
        }
        r += cu + String.valueOf(c);
        System.out.println("Chuoi sau khi nen: " + r);
        sc.close();
    }
}

