public class SumAlternate {
    public int AlternateSum(int n){
        if(n==1){return 1;}
        if(n%2==0){return AlternateSum(n-1)-n;}
        else{return AlternateSum(n-1)+n;}
    }

    public static void main(String[] args) {
        SumAlternate a= new SumAlternate();
        System.out.println(a.AlternateSum(10));
    }
    
}
