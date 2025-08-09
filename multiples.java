public class multiples {
    public void Multiple(int n ,int k){
        if(k==0){
            return;
        }
        Multiple(n, k-1);
        System.err.println(n*k);
    }
public static void main(String[] args) {
    multiples m = new multiples();
    m.Multiple(12, 10);
    
}
}


