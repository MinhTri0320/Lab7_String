package Lab7_string;
import java.util.Scanner;
public class Acronym {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap cum tu: ");
        String n= sc.nextLine();
        String a = taoAcronym(n);
        System.out.println("Viet tat: " + a);
        sc.close();
    }
    public static String taoAcronym(String n){
        String[] w=n.trim().split("\\s+");
        StringBuilder a=new StringBuilder();
        for(String w1 :w){
            if(!w1.isEmpty()){
                
                a.append(Character.toUpperCase(w1.charAt(0)));
        }
    }
        return a.toString();
  }
}
