/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cointhing;

import java.util.ArrayList;

/**
 *
 * @author samlu
 * @author mattwi
 */
public class CoinThing {
	int coinTable[];
    public int minCoins(int coins[], int V){
        int m = coins.length;

        int table[] = new int[V + 1];
        coinTable = new int[table.length];

        table[0] = 0;
        coinTable[0] = 0;

        for (int i = 1; i <= V; i++)
        table[i] = Integer.MAX_VALUE;

        for (int i = 1; i <= V; i++)
        {
            for (int j = 0; j < m; j++){
                if (coins[j] <= i)
                {
                    int sub_res = table[i - coins[j]];
                    if (sub_res != Integer.MAX_VALUE && sub_res + 1 < table[i]) {
                            table[i] = sub_res + 1;
                            coinTable[i] = coins[j];
                    }
                }
            }
        }
        return table[V];
    }
    public String[] changeMaker(int[] a, int i){
    		int counter;
    		int counter2 = 0;;
        String[] answer;
         if(!(a == null)){
            answer = new String[minCoins(a,i)];
            counter = i;
            while(counter>0) {
            		answer[counter2] = Integer.toString(coinTable[counter]);
//            		System.out.println(answer[counter2]);
            		counter2++;
            		counter = counter - coinTable[counter];
            }
        }
        else
            answer = null;
        return answer; 
    }
}
