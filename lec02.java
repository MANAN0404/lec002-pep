import java.util.*;
class lec02{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        for(int i=2; i<=n; i++){
            boolean isprime=true;
            for(int j=2; j*j<=i; j++){
                if(i%j==0){
                    isprime=false;
                }
            }
              if(isprime){
                System.out.print(i+ " ");
            }
        }
    }
}