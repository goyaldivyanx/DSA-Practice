public class Fibonacci {
    public int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        System.out.println(f.fibo(6));
    }
    
}


/*
 * TIME O(2^n)
 * SPACE 0(n)
 */