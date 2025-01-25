public class problem {
    public static void main(String[] args) {
        int[] a={2,3,5,1,4};
        int n=a.length;
        int lsum;
        int rsum;
        for(int i=0;i<n;i++){
            lsum=0;
            rsum=0;
            for(int j=0;j<=i-1;j++){
                lsum+=a[j];
            }
            for(int k=i+1;k<n;k++){
                rsum+=a[k];
            }
            if(lsum == rsum){
                System.out.println("Left most equillibrium index is : "+i);
    
            }
           
        }
        
    }
}