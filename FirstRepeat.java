public class FirstRepeat {
    public int RepeatedElement(int arr[]){
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FirstRepeat F = new FirstRepeat();
        int arr[] = {1,2,4,6,7};
        System.out.println(F.RepeatedElement(arr));
        
    }
    
}
