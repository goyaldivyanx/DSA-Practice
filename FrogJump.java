import java.lang.Math;
public class FrogJump {
    public int JumpCost(int arr[], int cost,int idx){
        if(idx==arr.length-1){
            return cost;
        }
        if(idx==arr.length-2){
            int c = Math.abs(arr[idx]-arr[idx+1]);
            return cost+c;
        }
        else{

        int cost1 = Math.abs(arr[idx]-arr[idx+1]);
        int cost2 = Math.abs(arr[idx]-arr[idx+2]);
        
        int a = JumpCost(arr,cost+cost1,idx+1);
        int b = JumpCost(arr,cost+cost2,idx+2);
        return(Math.min(a, b));
        }

        
    }
    public static void main(String[] args) {
        FrogJump j = new FrogJump();
        int arr[]= {10,30,40,20};
        System.out.println(j.JumpCost(arr, 0, 0));
        
    }
    
}
