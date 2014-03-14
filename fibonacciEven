import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luis Garro on 1/10/14.
 * Location: Costa Rica ext:5582
 */
public class FibonacciEven {
    private static final int MAX=4000000;
    List<Integer> secuencia=new ArrayList<Integer>();

    public void fibonacci(int first,int second){
        if(first==1){
            secuencia.add(first);
            secuencia.add(second);
        }


        int contador=0;
        int nextSum=0;
        while(secuencia.get(contador)<=MAX){

            nextSum=secuencia.get(contador)+secuencia.get(contador+1);
            secuencia.add(contador+2,nextSum);
            contador ++;
        }
        System.out.println(sumatoriaFibonacci());

    }

    private int sumatoriaFibonacci(){
        int sumatoria=0;
        for(int num:secuencia){
            if(num%2==0 && num<=MAX){
                sumatoria+=num;
            }
        }
        return sumatoria;
    }
}
