import java.util.Scanner;
//done
public class VanyaFence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no_friends = sc.nextInt();
        int fheight = sc.nextInt();
        int[] arr = new int[no_friends];
        for(int i=0; i<no_friends; i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0; i<no_friends; i++){
            if(arr[i]>fheight){
                sum+=2;
            }
            else{
                sum+=1;
            }
        }
        System.out.println(sum);
    }
}