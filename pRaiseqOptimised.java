public class pRaiseqOptimised {
    public int pow(int p,int q){
        if(q==0){return 1;}
        if(q%2==0){
             int a = pow(p,q/2);
            return a*a;
        }else{
            int a = pow(p,q/2);
            return a*a*p;
        }
    }

    public static void main(String[] args) {
        pRaiseqOptimised p = new pRaiseqOptimised();
        System.out.println(p.pow(2,5));
    }
    
}
