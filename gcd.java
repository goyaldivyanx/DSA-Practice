public class gcd {
    public int GCD(int x,int y){
        if(y==0){
            return x;
        }
        return GCD(y,x%y);
    }
    public static void main(String[] args) {
        gcd g = new gcd();
        System.out.println(g.GCD(15,24));
    }
}
