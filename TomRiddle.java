import java.util.*;

public class TomRiddle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextLine();
            boolean check = false;
            for(int j=0; j<i; j++){
                if(arr[i].equals(arr[j])){
                    check=true;
                }
            }
            if(check){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}