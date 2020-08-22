import java.util.Scanner;
class pattern{
    Scanner scn = new Scanner(System.in);
    System.out.print("enter the number");
    int n = scn.nextInt();
    int nsp = 2*(n-1);
    int nst = 1;
    int num = 1;
    for(int cr=1;cr<=n;cr++){
      for (int cst=1;cst<=nst; cst++){
        System.out.print(num);
        num++;
    }
      for(int csp=1;csp<=nsp;csp++){
        System.out.print(" ");
    }
    for(int cst=1;cst<=nst;cst++){
        num--;
        if(num!=n){
            System.out.print(num);
        }
    }
    nsp--;
    nst++;
    System.out.println();
    }
}