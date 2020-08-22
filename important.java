
import java.util.*;
class important{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int r= scn.nextInt();
        int length=0;
        int n1=n;

        while(n1>0){
            n1=n1/10;
            length++;
        }
        r= r % length;
        if(r<0){
            r=r+length;
        }

        int pow=1;
        int  post=0;
        int r1=r;
        while(r1>0){
           int rem=n%10;
            n=n/10;
            post=pow*rem + post;
            pow=pow*10;
            r1--;
        }

        length=length-r;
        while(length>0){
            post=post*10;
            length--;
        }
        post=post+n;
        System.out.print(post);
                     
           
    }
}