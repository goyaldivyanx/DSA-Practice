//Count the number of element Striclty greter then value of x

public class ArrayGreaterthen{
    public int GreaterElement(int arr[], int x){
        int count=0;
        for(int i:arr){
            if(i>x){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayGreaterthen a = new ArrayGreaterthen();
        int arr[] = {1,5,5,5,7,7,8};
        int x = 5;
        System.out.println(a.GreaterElement(arr, x));
        
    }
}

/*
 * time complexity: O(n);
 * space complexity : O(1);
 */