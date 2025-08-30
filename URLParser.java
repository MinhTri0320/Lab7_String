package Lab7_string;
import java.util.Scanner;
public class URLParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap URL: ");
        String n = sc.nextLine().trim();
        int pt = n.indexOf("://");
        if (pt == -1) {
            System.out.println("URL khong dung!");
            return;
        }
        String po= n.substring(0, pt);
        int domainStart= pt + 3;
        int pathStart = n.indexOf("/", domainStart);
        String d;
        String p;
        if (pathStart == -1) {
            d= n.substring(domainStart);
            p= "/";
        } else {
            d= n.substring(domainStart, pathStart);
            p= n.substring(pathStart);
        }
        System.out.println("Protocol: " + po);
        System.out.println("Domain: " + d);
        System.out.println("Path: " + p);
        sc.close();
    }
}