public class pivotarrysum {
    public static void main(String[] args) {
        int a[]={1,7,3,4,6,10};
        int n=a.length;
        int sum=0;  
        for(int i:a)
        sum+=i;
        int lsum=0;
        int rsum=sum;
        for(int i=0;i<n;i++)
        {
            rsum=rsum-a[i];
            if(lsum==rsum){
            System.out.println(i);
            break;
            }
            lsum+=a[i];
        
        }
    }
}
