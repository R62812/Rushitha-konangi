class Linear {
    public static void main(String args[]){
        int[] a={10,20,30,40,50};
        int n=45;
        boolean flag=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                flag=true;
            }
        }
        if(flag==true){
            System.out.print("Found");
        }
        else{
            System.out.print("Not found");
        }
    }
}
    

