package TenThousandOnePrime;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Luis Garro on 3/3/14.
 * Location: Costa Rica ext:5582
 */
public class TenThousandOnePrime {

    public static void main(String[]args){

        TenThousandOnePrime ttp=new TenThousandOnePrime();
        System.out.println(ttp.findPrimeN());

    }

    /**
     *
     *By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     *What is the 10 001st prime number?
     */
    private static final int DESIRED_PRIME =10001;
    private static final int LOOPS=10003;
    private static final int ONE=1;

    public int findPrimeN(){

        ArrayList<Integer>primeNumbers=new ArrayList<Integer>();
        int probablePrime=2;

        do{
            //como hacer el check que no es divisible por algun otro
            if(isPrime(probablePrime)){
                primeNumbers.add(probablePrime);
            }
            probablePrime++;
        }while(primeNumbers.size()<=DESIRED_PRIME);

        return primeNumbers.get(DESIRED_PRIME-1);

    }
    private boolean isPrime(int num){

        for(int divisor=2;divisor<=num;divisor++){
            if(num%divisor==0 && divisor!=ONE &&divisor!=num){
                return false;
            }
        }

        if(num%num==0 && num%ONE==0){
            return true;
        }
        return false;
    }
}
