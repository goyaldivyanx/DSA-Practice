public class Lexi{
    public static void swap(String arr[], int a,int b){
        String temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void lexisort(String arr[]){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j].compareTo(arr[min])<0){
                    min=j;
                }
            }
            swap(arr,i,min);
        }
    }
    public static void main(String[] args) {
        String arr[] ={ "cat","cot","college","com"};
        lexisort(arr);
        for(String i:arr){
            System.out.println(i);
        }
    }
    
}
