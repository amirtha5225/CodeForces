import java.util.*;

public class CloudberryJam{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        for(int i=0; i<val; i++){
            int n = sc.nextInt();
            int ans = 2*n;           
            System.out.println(ans);
        }
    }
}