public class Google1 {

    public int Substingcheck(String s,String[] arr){
        int count =0 ;
        for(String t : arr){
            int i=0;
            int j=0;
            int n1=s.length();
            int n2=t.length();
            while(i<n1 && j<n2){
                if(s.charAt(i)==t.charAt(j)){
                    i++;
                    j++;
                }
                else{
                    i++;
                }
            }
            if(j==n2){
                count++;
            }
            
        }
        return count;
    }

    public static void main(String[] args){
        Google1 g = new Google1();
        String arr[]= {"xyz","a","bb","acd","ace"};
        String s = "abcde";
        int c=g.Substingcheck(s, arr);
        System.out.println(c);

    }
    
}
