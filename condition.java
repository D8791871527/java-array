import java.util.Scanner;
public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//         int age= sc.nextInt();
//         if (age>18) {
//             System.out.println("you are eligible for vote");
//         } else {
//             System.out.println("you are not eligible for vote");
//         }
// int flag=1;
// for(int i=2;i<n/2 ;i++)
// {
//     if(n%i==0)
//     flag=0;
//     break;
// }
// if(flag==0)
// {
//     System.out.println("not prime");
// }
// else{
//     System.out.println("prime");
// }
int count=0;
while(n>0)
{
count+=1;
n/=10;
}
System.out.println(count);
    
}
    }


