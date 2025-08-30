package Lab7_string;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi thứ nhất: ");
        String n1 = sc.nextLine();
        System.out.print("Nhập chuỗi thứ hai: ");
        String n2 = sc.nextLine();
        if (areAnagrams(n1, n2)) {
            System.out.println("Hai chuỗi là Anagram.");
        } else {
            System.out.println("Hai chuỗi không phải là Anagram.");
        }
        sc.close();
    }
}