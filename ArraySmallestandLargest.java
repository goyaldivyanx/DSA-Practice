//RETURN AND ARRAY WITH CONSODT OF SMALLEST AND lARGEST ELEMTENT OF AN ARRAY

//APPROCH 1 : TIME COMPLEXITY O(N)
import java.util.Arrays;
public class ArraySmallestandLargest {
    public int[] minMaxValue(int[] arr){
        int out[]=new int[2];
        int min= arr[0];
        int max = arr[0];
        for(int i :arr){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        out[0]=min;
        out[1]=max;
        return out;
    }

    //APPROCH 2 : time complexity : O(n logn)
        public int[] minMax(int arr[]){
            Arrays.sort(arr);
            int out[]=new int[2];
            out[0]=arr[0];
            out[1]=arr[arr.length-1];
            return out;

        }

        public static void main(String[] args) {
            ArraySmallestandLargest a = new ArraySmallestandLargest();
            int arr[]={ 5,8,1,3,6,2};
            int[] out = a.minMax(arr);
            for(int i:out){
                System.out.print(i+" ");
            }

        
        }
        
    }




