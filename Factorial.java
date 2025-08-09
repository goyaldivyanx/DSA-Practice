public class Factorial {
    public int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return fact(n-1)*n;
    }
    public static void main(String[] args) {
        Factorial f  = new Factorial();
        System.out.println(f.fact(5));
        
    }
    
}


/*
 * Time O(n)
 * space O(n)
 */