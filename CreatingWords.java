import java.util.*;

public class CreatingWords{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        sc.nextLine();
        
        for(int i=0; i<val; i++){
            String s1 = sc.next();
            String s2 = sc.next();

            StringBuilder sb1 = new StringBuilder(s1);
            StringBuilder sb2 = new StringBuilder(s2);
        
            sb1.setCharAt(0,s2.charAt(0));
            sb2.setCharAt(0,s1.charAt(0));

            System.out.println(sb1.toString()+" "+sb2.toString());

        
        }
    }
}