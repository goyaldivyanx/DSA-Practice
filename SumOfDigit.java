public class SumOfDigit {
    public int DigitSum(int n){
        if(n==0){
            return 0;
        }
        return DigitSum(n/10)+(n%10);
    }

    public static void main(String[] args) {
        SumOfDigit d = new SumOfDigit();
        System.out.println(d.DigitSum(5));
    }
    
}


/*
 * time O(log n)
 * space O(log n)
 */
