public class Pivotarray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,6,10};
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
            System.out.println("pivot array:-"+i);
            break;
            }
            lsum+=a[i];
        
        }
    }
}

// git init
// git add README.md
// git commit -m "first commit"
// git branch -M main
// git remote add origin https://github.com/D8791871527/java-array.git
// git push -u origin main