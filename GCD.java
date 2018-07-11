import java.util.Scanner;
public class GCD {
    
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=3;
        int r1[]=new int[15],q,r;
       System.out.println("how many number you want to enter  ");
        n=x.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("enter r"+(i+1));
        r1[i]=x.nextInt();
        }
        for(int i=0;i<n;i++){
        while(r1[1]>0){
            q=r1[0]/r1[1];
            r=r1[0]-(q*r1[1]);
            r1[0]=r1[1];
            r1[1]=r;
        }
        r1[1]=r1[i+2];
        }
        System.out.println("gcd of "+n+" number is "+r1[0]);
    }
    
}
