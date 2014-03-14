package SmallestMultiple;

/**
 * Created by Luis Garro on 2/25/14.
 * Location: Costa Rica ext:5582
 */
public class SmallestMultiple {

    private static int controlCounter=1;

    public enum Counter{
        INSTANCE;
        public int divisor =1;
        public void addOneToCounter(){
            INSTANCE.divisor++;
        }
    }


    private static final int MAXIMO =20;

    public static void main(String[]args){

        SmallestMultiple sm= new SmallestMultiple();
        System.out.println(sm.smallestMultiple());

   }
   ;
   public int smallestMultiple(){
       int targetNum=1;

       boolean divisible=true;

       while(divisible){
           if(targetNum%Counter.INSTANCE.divisor ==0){
               Counter.INSTANCE.divisor++;

           }else if(targetNum%Counter.INSTANCE.divisor !=0){
               targetNum++;
               controlCounter=0;//change it to 1 , because the targetnum changed
               Counter.INSTANCE.divisor =1;
           }

           divisible=continueDividing(targetNum);

       }
 return targetNum;

   }
    private boolean continueDividing(int targetNumber){

        if(targetNumber%Counter.INSTANCE.divisor ==0 && Counter.INSTANCE.divisor==MAXIMO){
            return false;
        }
        controlCounter++;
    return true;
    }
}
