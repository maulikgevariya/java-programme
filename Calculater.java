import java.util.Scanner;
public class Calculater {
    public static int sum(int x,int y){
        return(x+y);
    }
    public static int sub(int x,int y){
        return(x-y);
    }
    public static int mul(int x,int y){
        return(x*y);
    }
    public static int div(int x,int y){
        return(x/y);
    }
    public static void main(String args[]){
        Scanner x=new Scanner(System.in);
        int a=-1,b=-1;
        char c;
        while(a<0 || b<0){
        System.out.println("enter a");
        a=x.nextInt();
        if(a<0){
            System.out.println("enter proper number");
            continue;
        }
        System.out.println("enter b");
        b=x.nextInt();
        if(b<0){
            System.out.println("enter proper number");
            continue ;
        }
    }
        while(3>0){
        System.out.println("enter operaor you have to perform");
        c=x.next().charAt(0);
        switch(c){
        
        case '+' : System.out.println("a + b = "+sum(a,b));
                    break;
        case '-' : System.out.println("a - b = "+sub(a,b));
                    break;
        case '*' : System.out.println("a * b = "+mul(a,b));
                    break;
        case '/' : System.out.println("a / b = "+div(a,b));
                    break;
        default  : System.out.println("Enter proper symbol");
                    continue;
    }
        break;
        }
    }
}
