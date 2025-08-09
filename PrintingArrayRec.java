public class PrintingArrayRec {
    public void print(int arr[], int i){
        if(i==0){
            System.out.println(arr[i]);
            return;
            
        }
        print(arr,i-1);
        System.out.println(arr[i-1]);
        return ;
        
    }

    public static void main(String[] args) {
        PrintingArrayRec p = new PrintingArrayRec();
        int arr[] = {10,20,30,40,50,60};
        p.print(arr,arr.length);

    }
}
