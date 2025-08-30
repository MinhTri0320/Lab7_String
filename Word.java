package Lab7_string;
import java.lang.Object;
import java.util.Scanner;
public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap cau: ");
        String n=sc.nextLine();
        String[] w=n.split(" ");
        String r= " ";
        for(int i=w.length-1; i>=0; i--){
            r+=w[i];
            if(i!=0){
                r+=" ";
            }
        }
        System.out.println("Cau dao nguoc: " + r);
        sc.close();
    }
}
