import java.util.Scanner;

public class LoveStory{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int val = sc.nextInt();
        sc.nextLine();
        String s1 = "codeforces";
        for(int i=0; i<val; i++){
            String s2 = sc.nextLine();
            int count =0;
            
                for(int k=0; k<s1.length(); k++){
                    if(s1.charAt(k)!=s2.charAt(k)){
                        count++;
                    }
                }
                System.out.println(count);
            
        }
    }

    
}