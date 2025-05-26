import java.util.Arrays;
class Selection {
    public static void main(String[] args) {
            int [] a={1,5,6,4,2};
            for(int p=1;p<a.length;p++){
                int m=p;
                for(int i=0;i<a.length-p;i++){
                    if  (a[i]<a[m]){
                        m=i;
                    }
                }
                int t=a[m];
                        a[m]=a[p];
                        a[p]=t;
            }
            System.out.print(Arrays.toString(a));
        }
    }
    
    

