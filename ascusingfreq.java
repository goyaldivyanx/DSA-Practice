public class ascusingfreq {
    public void arrange(int arr[]){
        int freq[] = new int [3];
        for(int i:arr){
            freq[i]++;
        }
        int index=0
        for(int i=0;i<3,i++){
            while(freq[i]>0){
                arr[index]=freq[i];
                index++;
                freq[i]--;
            }

        }
    }
    public static void main(String[] args) {
        
    }
    
}
