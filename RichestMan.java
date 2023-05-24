import java.util.Scanner;
public class RichestMan {
    public static void main(String[] args) {

        int[][] accounts = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int wealthy = maximumWealth(accounts);
        System.out.println(wealthy);
    }

    static int maximumWealth(int[][] accounts) {
        int max_wealth=Integer.MIN_VALUE;
                for(int rows=0;rows<accounts.length;rows++){
                    int wealth=0;
                    for(int col=0;col<accounts[rows].length;col++){
                        wealth+=accounts[rows][col];
                    }

                    if(wealth>max_wealth){
                        max_wealth=wealth;
                    }
                }


                return max_wealth;

            }
        }

