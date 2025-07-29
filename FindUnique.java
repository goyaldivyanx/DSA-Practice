//Find the unique number in given array where all the elemnt are being  repeated  twice with one value being uniqu

public class FindUnique {
    public int UniqueElement(int arr[]){
                int unique=0;
        for(int i=0;i<arr.length;i++){
            boolean flag = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                unique=arr[i];
                break;
            }
        }
        return unique;
    }
    public static void main(String[] args) {
        FindUnique F = new FindUnique();
        int arr[]={1,2,3,4,2,1,3};
        System.out.println(F.UniqueElement(arr));
        
    }
    
}
