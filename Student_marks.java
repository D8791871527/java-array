import java.util.Scanner;
public class Student_marks {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the marks of physics:-");
    float phy=sc.nextInt();
    System.out.println("enter the marks of chemistry:-");
    float chem=sc.nextInt();
    System.out.println("enter the marks of bio:-");
    float bio=sc.nextInt();
    System.out.println("enter the marks of math:-");
    float math=sc.nextInt();
    System.out.println("enter the marks of computer{-}");
    float comp=sc.nextInt();

    float t=(phy+chem+bio+math+comp);
     float p=(t/500)*100;
     System.out.println("enter the mark percentage"+ p);
     if(p>=90)
     {
        System.out.println("Grade A:");
     }
     else if( p>=80)
     {
        System.out.println("Grade B:-");
     }
     else if(p>=70){
        System.out.println("Grade C:");
     }
     else if( p>=60)
     {
        System.out.println("Grade D:");
     }
     else if(p>=50){
        System.out.println("Grade E::");
     }
     else if(p>=40)
     {
        System.out.println("Grade F");
     }
     else{
        System.out.println("your are fail");
     }

     }
        // switch (a) {
        //     case 1: p>=90;
        //     System.out.println("Grade A");
        //         break;
        //     case 2: p>=80;
        //     System.out.println("Grade B");
        //         break;
        //     case 3: p>=70;
        //     System.out.println("Grade C");
        //         break;
        //     case 4: p>=60;
        //     System.out.println("Grade D");
        //         break;
        //     case 5: p>=50;
        //     System.out.println("Grade E");
        //         break;
        //     case 6: p>=40;
        //     System.out.println("Grade F");
        //         break;
        //     default:System.out.println("not match case");
        //         break;
     }


