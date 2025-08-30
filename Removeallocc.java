public class Removeallocc {
    public String removeAll(String s,char a){
        String ans ="";
        for(int i=0;i<s.length();i++){
            if(a!=s.charAt(i)){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Removeallocc r = new Removeallocc();
        String s = "Abcdefassassaa";
        char c = 'a';
        System.out.println(r.removeAll(s, c));
    }
}
