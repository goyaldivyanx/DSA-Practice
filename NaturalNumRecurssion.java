public class NaturalNumRecurssion {
    public void numbers(int n){
        if(n==0){
            return;
        }
        numbers(n-1);
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        NaturalNumRecurssion n = new NaturalNumRecurssion();
        n.numbers(10);
        
    }
    
}
