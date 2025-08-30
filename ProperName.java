package Lab7_string;
import java.util.Scanner;
public class ProperName {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Nhap ho va ten: ");
       String n=sc.nextLine();
       String[] w =n.trim().split("\\s+");
       String r=" ";
       for(String w1:w){
           r+= w1.substring(0, 1).toUpperCase() + w1.substring(1).toLowerCase() + " ";
       }
       System.out.println("Ten sau khi nhap: "+ r);
       sc.close();
    }
}
