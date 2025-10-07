import java.util.*;

public class CubicalPlanet{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();

        if((n1==n4)||(n2==n5)||(n3==n6)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }




    }
}