import java.util.*;

public class SubsequencePermutation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val=sc.nextInt();
        sc.nextLine();

        for(int k=0; k<val; k++){
            int count=0;
            int n=sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();

            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String newstr = new String(arr);
            for(int i=0; i<n; i++){
                if(s.charAt(i)!=newstr.charAt(i)){
                    count++;
                }
            }
            System.out.println(count);
        }
    
    }
}