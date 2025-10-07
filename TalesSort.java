import java.util.Scanner;
//done
public class TalesSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        for(int i=0; i<val; i++){
            int len = sc.nextInt();
            int[] arr = new int[len];
            for(int j=0; j<len; j++){
                arr[j] = sc.nextInt();
            }

            int maxi=0;      

            for(int j=0; j<len-1; j++){
                if(arr[j]>arr[j+1]){
                    maxi = Math.max(arr[j],maxi);
                }
            }
            System.out.println(maxi);
        }
        
        
    }
}