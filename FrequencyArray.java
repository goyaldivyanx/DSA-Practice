// Given Q quiries, check if the given number is present or not in the array(note: the max value in a arrya is 10^5)
//since we have upper bound we will be using frequecny array

import java.util.Scanner;
public class FrequencyArray {
    public int[] makefrequencyArray(int arr[]){
        int freq[]=new int[10010];
        for(int i:arr){
            freq[i]++;
        }
        return freq;
    }
    public String check(int arr[],int n){
        int freq[] = makefrequencyArray(arr);
        if(freq[n]>0){
            return "Yes";
        }
        else{
            return "No";
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FrequencyArray f = new FrequencyArray();
        int arr[] = {5,6,5,400,560,1000,600,400};
        int q = 5;
        while(q>0){
            int n =sc.nextInt();
            System.out.println(f.check(arr, n));
            q--;
        }
        sc.close();
    }
    
}
