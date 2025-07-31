public class ArraySquare {
    public int[] SquaredArray(int arr[]){
        int[] result = new int[arr.length];
        int l=0;
        int r=arr.length-1;
        int index =arr.length-1;

        while(l<=r && index>=0){
            int ls =arr[l]*arr[l];
            int rs =arr[r]*arr[r];
            if(ls>rs){
                result[index]=ls;
                l++;
                index--;
            }else{
                result[index]=rs;
                r--;
                index--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArraySquare a = new ArraySquare();
        int arr[] = {-10,-3,-2,1,4,5,20};
        int[] rs = a.SquaredArray(arr);

        for(int i :rs){
            System.out.println(i);
        }
        
    }
    
}
