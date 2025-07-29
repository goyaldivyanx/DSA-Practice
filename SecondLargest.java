public class SecondLargest {
    public int Findmax(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public int SecondMax(int arr[]){
        int secondmax = Integer.MIN_VALUE;
        int max =Findmax(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondmax && arr[i]<max){
                secondmax= arr[i];
            }
        }
        return secondmax;
    }
    public static void main(String[] args) {
        SecondLargest S = new SecondLargest();
        int arr[]={9,8,9,6,9,5,8};
        System.out.println(S.SecondMax(arr));
        
    }   
}
