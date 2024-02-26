import java.util.Scanner;
public class Arrat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array");
        int r=sc.nextInt();
        int c=sc.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r-1;j++)
            {
                System.out.println(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.println(k);
            }
            for(int f=1;f>=i-1;f++)
            {
                System.out.print(i);
            }
        }
        System.out.println();
    //     int arr[]={5,4,3,2,1};
    //     int max=arr[0];
    //     int sm=0;
    //     for(int i=0;i < arr.length;i++)
    //     {
    //         if(arr[i]>max){
    //             sm = max;
    //         max=arr[i];
    //     } else if (arr[i] > sm) {
    //         sm = arr[i];
    //     }
    // }
    
    // System.out.println("the element max: "+ max);
    // System.out.println("the element second max: "+ sm);
}
}
