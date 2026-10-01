import java.util.*;
public class prime_number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        int sum=0;
        for(int i=1;i<=Number;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            
            }
            if(count==2){
                System.out.print(" "+i);
                sum=sum+i;
            }
        }
        
        System.out.println(sum);
    }
}