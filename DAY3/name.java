package DAY3;
import java.util.*;
public class name{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        for(int i=1;i<=Number;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.print(" "+i);
            }
        }

    }
}