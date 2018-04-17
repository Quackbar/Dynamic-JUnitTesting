/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointhing;

/**
 *
 * @author samlu
 */
public class CoinThing {

    /**
     * @param args the command line arguments
     */
//    public CoinThing(){
//        int[] a = {1,5,10,25};
//        changeMaker(a, 64);
//    }
    public int minCoins(int coins[], int V){
        int m = coins.length;

        int table[] = new int[V + 1];

        table[0] = 0;

        for (int i = 1; i <= V; i++)
        table[i] = Integer.MAX_VALUE;

        for (int i = 1; i <= V; i++)
        {

            for (int j = 0; j < m; j++){
                if (coins[j] <= i)
                {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i])
                            table[i] = sub_res + 1;
                }
            }
        }
        return table[V];
    }
    public String[] changeMaker(int[] a, int i){
        int counter = 1;
        int counter3 = 0;
        int temp = i;
        String[] answer;
         if(!(a == null)){
            answer = new String[minCoins(a,i)];
            while(i!=0){
                if((i-a[a.length-counter])>=0){
                    i = i - a[a.length-counter];
                    answer[counter3] = Integer.toString(a[a.length-counter]);
                    counter3++;
                }
                else
                    counter++;
            }
        }
        else
            answer = null;
        return answer; 
    }
//    public static void main(String args[]){
//        CoinThing c = new CoinThing();
//    }
}
