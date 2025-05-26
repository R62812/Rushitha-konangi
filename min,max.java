 class Min {
  
        public static void main(String args[]){
            int[] a={10,20,30,2,50};
            int min=a[0];
            int max=a[0];
            for(int i=0;i<a.length;i++){
                if(a[i]<min){
                    min=a[i];
                }
                else if(a[i]>max){
                    max=a[i];
                }
            }
            System.out.println("maximum is: "+max);
            System.out.println("minimum is: "+min);
        }
    }
    

