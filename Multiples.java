package Multiplesof3and5;

/**
 * Created by Luis Garro on 1/9/14.
 * Location: Costa Rica ext:5582
 */
public class Multiples {

    //encontrar numeros que sea multiplos del 3 0 5 , y dar como
    // resalutado la suma de esos numero
    public int sumarMultiplos(){
        int limite=1000;
        int sumatoria=0;
        for(int i=0;i<limite;i++){
            if(i%3==0){
               sumatoria+=i;
                continue;
            }
            if(i%5==0){
                sumatoria+=i;
            }

        }
      return sumatoria;
    }
}
