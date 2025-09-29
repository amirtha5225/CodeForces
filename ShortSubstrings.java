import java.util.Scanner;

public class ShortSubstrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt();
        sc.nextLine();
        for(int k=0; k<val; k++){
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            for(int i=1; i<s.length();i+=2){
                sb.append(s.charAt(i));
            }
        System.out.println(sb.toString());
    }
}
}