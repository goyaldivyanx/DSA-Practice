import java.util.ArrayList;
public class RecurSSQ {
    public ArrayList<String> getSSQ(String s){
        ArrayList<String> L = new ArrayList<>();
        //baseCase
        if(s.length()==0){
            L.add("");
            return L;
        }
        //subProblem
        char curr = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));

        for(String ss:smallAns){
            L.add(curr+ss);
        }
        for(String ss:smallAns){
            L.add(ss);
        }



        return L;

    }
    public static void main(String[] args) {
        RecurSSQ g = new RecurSSQ();
        System.out.println(g.getSSQ("abc"));
    }
    
}
