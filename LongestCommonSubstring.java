package Lab7_String;
import java.util.Scanner;
public class LongestCommonSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi 1: ");
        String s1 = sc.nextLine();
        System.out.print("Nhap chuoi 2: ");
        String s2 = sc.nextLine();
        String lcs = findLongestCommonSubstring(s1, s2);
        if (lcs.isEmpty()) {
            System.out.println("Khong co chuoi con chung nao.");
        } else {
            System.out.println("Chuoi con chung dai nhat la: " + lcs);
        }
        sc.close();
    }
    public static String findLongestCommonSubstring(String s1, String s2) {
        String shorter = (s1.length() < s2.length()) ? s1 : s2;// Xác định chuỗi ngắn và chuỗi dài
        String longer = (s1.length() < s2.length()) ? s2 : s1;
        String longest = "";
        for (int i = 0; i < shorter.length(); i++) {     // Duyệt tất cả substring của chuỗi ngắn
            for (int j = i + 1; j <= shorter.length(); j++) {
                String sub = shorter.substring(i, j);
                if (longer.contains(sub) && sub.length() > longest.length()) {
                    longest = sub;
                }
            }
        }
        return longest;
    }
}