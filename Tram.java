import java.util.Scanner;
//done
public class Tram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no_stops = sc.nextInt();
        int[] exitarr = new int[no_stops];
        int[] enterarr = new int[no_stops];
        for(int i=0; i<no_stops; i++){
            exitarr[i] = sc.nextInt();
            enterarr[i] = sc.nextInt();
        }
        int cap = enterarr[0]-exitarr[0];
        int max = cap;
        for(int i=1; i<no_stops; i++){
            cap += enterarr[i]-exitarr[i];
            max = cap>max?cap:max;

        }

        System.out.println(max);

        
        
    }
}