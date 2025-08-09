public class ArrayCheckRec {
    public boolean check(int arr[],int x,int i){
        if(i==arr.length){
            return false;
        }
        if(arr[i]==x){
            //System.out.println("Yes,Exist!!");
            return true;
        }else{
            return check(arr,x,i+1);
        }

 }
    public static void main(String[] args) {
        int arr[] = {4,12,54,14,3,8,6,1};
        ArrayCheckRec c =  new ArrayCheckRec();
        int x = 24;
        System.out.println(c.check(arr, x, 0)?"Yes":"No");
        
    }
}
