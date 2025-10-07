import java.util.Scanner;
//done
public class Haiku{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] arr= new String[3];
        int[] pattern = {5, 7, 5};
       
        for(int i=0; i<3; i++){
            arr[i] = sc.nextLine();
        }
        for(int i=0; i<3; i++){
             int count =0;
            String l = arr[i].toLowerCase();
            for(int j=0; j<l.length(); j++){
                if(l.charAt(j)=='a'||l.charAt(j)=='e'||l.charAt(j)=='i'||l.charAt(j)=='o'||l.charAt(j)=='u'){
                    count++;
                    
                }
                
            }
            if(count!=pattern[i]){ System.out.println("NO"); return;}
        }
        System.out.println("YES");
    }
}