public class negpos {
    public void swap(int arr[],int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void specialSort(int arr[]){
        int x = 0;
        int y = arr.length -1 ;
        while(x<y){
            if(arr[x]>0 && arr[y]<0){
                swap(arr,x,y);
                x++;
                y--;
            }
            if(arr[x]<0){
                x++;
            }
            if(arr[y]>0){
                y--;
            }
        }
    }

    public static void main(String[] args) {
        negpos s = new negpos();
        int arr[] = {19,-20,7,-4,-13,11,-5,3};
        s.specialSort(arr);

        for(int i:arr){
            System.out.println(i);
        }
        
    }
    
}
