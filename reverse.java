import java.util.*;
class reverse{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;
        int r;
        while(n>0){
            r = n%10;
            n = n/10;
            ans = r + ans*10;
        }
     System.out.print(" the answer = " + ans);
    }
}