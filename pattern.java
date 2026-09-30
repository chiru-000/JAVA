import java.util.*;
public class pattern{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         while(num>9){
            int sum=0;
            while(num>0){
                int digit=num%10;
                sum=sum+digit;
                num=num/10;
            }
            num=sum;
         }
         if(num==1){
            System.out.println("Magic Number");
         }else{
            System.out.println("Not a magic Number");
         }
    }
}