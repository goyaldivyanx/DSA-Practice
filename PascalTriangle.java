public class PascalTriangle {
    public int[][] Pascal(int n){
        int res[][] =new int[n][n];

        for(int i=0;i<n;i++){
            res[i][0]=1;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                res[i][j]= res[i-1][j-1]+res[i-1][j];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        PascalTriangle p =new PascalTriangle();
        int[][] res = p.Pascal(5);

        for(int i = 0 ;i<res.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
        }

    }

