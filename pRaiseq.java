public class pRaiseq {
    public int pow(int p,int q){
        if(q==0){
            return 1;
        }
        return p*pow(p,q-1);
    }

    public static void main(String[] args) {
        pRaiseq p = new pRaiseq();
        System.out.println(p.pow(2,5));
    }
    
}
