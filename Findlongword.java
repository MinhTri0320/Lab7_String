package Lab7_string;
import java.util.Scanner;
public class Findlongword {
    public static String findLongestWord(String sentence) {
        String[] w= sentence.split(" ");
        String longw = "";
        for (String w1 : w) {
            if (w1.length() > longw.length()) {
                longw = w1;
            }
        }
        return longw;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot cau: ");
        String n = scanner.nextLine(); 
        String r = findLongestWord(n);
        System.out.println("Tu dai nhat la: " + r);
    }
}