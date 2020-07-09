//you can move either n-1 or m-1
import java.util.*;
public class main {
    //This is driver code
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();
        String[] input = line.split(" ");
        int x = calculateDistance(Integer.parseInt(input[0]),Integer.parseInt(input[1]));
        System.out.println(x);
    }

    public static int calculateDistance(int n, int m){
        int dp[][] = new int[n+1][m+1];
        //fill x-axis with 1
        for(int i=0; i<=n; i++){
            dp[i][0]=1;

        }
        //y-axis with 1
        for(int i=0; i<=m; i++){
            dp[0][i]=1;

        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        return dp[n][m];
    }
}
