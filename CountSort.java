public class CountSort {
    public void countSort(int arr[]){
        int max= arr[0];
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        int f_arr[] = new int [max+1];
        for(int j:arr){
            f_arr[j]++;
        }

        int id = 0;
        for(int i=0;i<max+1;i++){
            while(f_arr[i]>0){
                arr[id]=i;
                id++;
                f_arr[i]--;

            }
        }
    }
    

    public static void main(String[] args) {
        CountSort c = new CountSort();
        int arr[] = {1,4,5,2,2,5};
        c.countSort(arr);
        for(int i:arr){
            System.out.println(i);
        }
        
    }
}