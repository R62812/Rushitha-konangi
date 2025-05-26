import java.util.Arrays;
 class Bubble  {
  
        public static void main(String args[]){
            int[] a={1,5,6,4,2};
            int temp;
            for(int i=1;i<a.length;i++){
                for(int j=0;j<a.length-i;j++){
                    if(a[j]>a[j+1]){
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            System.out.print(Arrays.toString(a));
        }
    }
    

