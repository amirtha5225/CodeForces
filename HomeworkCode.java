import java.util.Scanner;
import java.lang.StringBuilder;

public class HomeworkCode{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        for(int k = 0; k<val; k++){

        
        int n1 = sc.nextInt();
        sc.nextLine();
        String s1 = sc.nextLine().toLowerCase();
        int n2 = sc.nextInt();
        sc.nextLine();
        String s2 = sc.nextLine().toLowerCase();
        String s3 = sc.nextLine().toUpperCase();

        StringBuilder sb = new StringBuilder(s1);
        
        for(int i=0; i<n2; i++){
            if(s3.charAt(i)=='V'){
                sb.insert(0,s2.charAt(i));
                
            }
            else{
                sb.append(s2.charAt(i));
            }
        }
        System.out.println(sb.toString());

    }
    }
}
