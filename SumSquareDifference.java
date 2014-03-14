package sumsquaredifference;

import java.math.BigDecimal;

/**
 * Created by Luis Garro on 2/25/14.
 * Location: Costa Rica ext:5582
 */
public class SumSquareDifference {

    private final int MAXIMO=100;


    public static void main(String[]args){
        SumSquareDifference sd=new SumSquareDifference();
        System.out.println(sd.sumSquareDiff());
        System.out.printf("dexp: %f\n",sd.sumSquareDiff() );
    }

    /**
     *
     * gets both results from other two methods and
     * substracts them
     */
    public double sumSquareDiff(){
        double sumOfSquares=sumOfSquares();
        double squareSum=squareSum();

        int convertedValue= new BigDecimal(squareSum-sumOfSquares).intValue();

        return convertedValue ;
    }

    /**
     * Sum the squares of each number in the sequence 1..100
     * 1^2 + 2^2 + ... + 10^2 = 385
     * @return
     */
    public double sumOfSquares(){
        int sum=0;

        for(int i=1;i<=MAXIMO;i++){
            sum+= Math.pow(i,2);
        }
        return sum;
    }

    /**
     * Sums the sequence and then squares it
     * (1 + 2 + ... + 10)^2 = 55^2 = 3025
     * @return
     */
    public double squareSum(){
        int sum=0;
        double total=0;

        for(int i=1;i<=MAXIMO;i++){
            sum+=i;
        }
        total= Math.pow(sum,2);
        return total;
    }
}
