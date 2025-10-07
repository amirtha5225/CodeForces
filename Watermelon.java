import java.util.*;

public class Watermelon{
    public static boolean check(int n){
        for(int i=1; i<n; i++){
            int rem = n-i;
            if(i%2==0 && rem%2==0){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(check(n)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        

    }
}