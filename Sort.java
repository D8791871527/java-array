

public class Sort {
    public static void main(String[] args) {

        // sorted {01000110}
        // int a[]={0,1,0,0,0,1,1,0};
        // int zc=0;
        // for(int i=0;i<a.length;i++)
        // {
        //     if(a[i]==0)
        //     {
        //         zc+=1;
        //     }
        // }
        //     for(int i=0;i<a.length;i++)
        //     {
        //         if(i<zc)
        //         {
        //             a[i]=0;
        //         }
        //         else{
        //             a[i]=1;
        //         }
        //     }
        //     for(int i:a)
        //     {
        //         System.out.print(i+" ");
        //     }

        int a[]={0,1,0,0,0,1,1,0};
        int c=0;
        int d=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==0)
            c+=1;
            if(a[i]==1)
            d+=1;
        }
        d=d+c;
            for(int i=0;i<a.length;i++)
            {
                if(i<c)
                a[i]=0;
                else if(1<d&&i>=c)
                    a[i]=1;
                    else
                    a[i]=2;
            }
            for(int i:a)
            {

        System.out.print(i + " ");
    }
    // hw
    // arr={0,1,0,2,2,1,1,0}
}
}