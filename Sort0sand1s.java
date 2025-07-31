public class Sort0sand1s {
    public int count0s(int arr[]){
        int count = 0;
        for(int i :arr){
            if (i==0) {
                count++;                
            }
        }
        return count;
    }

    public void sorting(int arr[]){
        int zeros = count0s(arr);
        for(int i=0;i<zeros;i++){
            arr[i]=0;
        }
        for(int i=zeros;i<arr.length;i++){
            arr[i]=1;
        }
    }

    public static void main(String[] args) {
        Sort0sand1s s = new Sort0sand1s();
        int arr[] = {1,0,0,1,0,1,1,0,0};
        s.sorting(arr);
        

        for(int i :arr){
            System.out.println(i);
        }
        
    }
    
}
