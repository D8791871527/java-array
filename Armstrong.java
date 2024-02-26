import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the no:");
    int a=sc.nextInt();
    int s=0;
    int r,n;
    n=a;
    while(a!=0){
        r=n%10;
        s+=r*r*r;
        n/=10;
    }
    if(s==a)
    {
        System.out.println("Armtrong no is:");
    }
    else
    {
        System.out.println("not armstrong no");
    }
    
}
}