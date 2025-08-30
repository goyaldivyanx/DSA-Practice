public class printSSQ {
    public void PrintSSQ(String s,String curr){
        if(s.length()==0){
            System.out.println(curr);
            return;
        }
        char current = s.charAt(0);
        String st = s.substring(1);
        PrintSSQ(st, curr+current);
        PrintSSQ(st,curr);
    }
    public static void main(String[] args) {
        printSSQ p =new printSSQ();
        p.PrintSSQ("abc", "");
        
    }
    
}
