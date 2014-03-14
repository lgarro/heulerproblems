package LargestPrime;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Garro on 1/10/14.
 * Location: Costa Rica ext:5582
 */
public class LargestPrime {

    List<Integer> factoresPrimos=new ArrayList<Integer>();
   // int divisor=2;
    public void largestPrime(int num,int divisor){
        int siguiente;
        if(num<=1)return;

            if(num%divisor==0){
                siguiente=num/divisor;
                System.out.println("Este es el numero"+siguiente);
                factoresPrimos.add(divisor);
                 largestPrime(siguiente,divisor+1);

            }else{
                 largestPrime(num,divisor+1);
            }



    }

}

