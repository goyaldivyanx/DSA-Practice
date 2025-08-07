public class SumofNumRecurrsion {
    public int SumofNum(int n){
        if(n==1){return 1;}
        return SumofNum(n-1)+n;
    }
    public static void main(String[] args) {
        SumofNumRecurrsion s =new SumofNumRecurrsion();
        System.out.println(s.SumofNum(5));
        
    }
    
}
