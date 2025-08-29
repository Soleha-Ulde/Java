import java.util.*;
public class Rectanglepattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter the number of cols: ");
        int n = sc.nextInt();
        System.out.println();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        
    }
}