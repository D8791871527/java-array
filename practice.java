import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=i; k<=n-i; k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println(" ");
        }
    }
}


