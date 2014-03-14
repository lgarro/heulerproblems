package LargestProductSeries;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Luis Garro on 2/11/14.
 * Location: Costa Rica ext:5582
 */
public class LargestProductSeries {


    public static void main(String[]args){

        LargestProductSeries lps= new LargestProductSeries();
        System.out.println(lps.largestProductSeries());


    }

    private List<String> numberSeriesText;
    private ArrayList<Integer>numberSeries;
    private static final int SERIE=5;
    public int largestProductSeries(){

        int highestNumber=-1;
        int lastIndex=-1;
        int currentNumber=-1;
        int tempResult=0;
        processNumbers();

        for(int i=0;i<numberSeries.size();i++){

            currentNumber= numberSeries.get(i);


            int maxLoops=i+5;//plus four for the sequence needed
            for(int j=i+1;j<maxLoops;j++){
                int nextMultiplier;
                if(j<=1000){
                 nextMultiplier=numberSeries.get(j);
                }else{
                    continue;
                }


                if(tempResult!=0){
                    tempResult=(tempResult*nextMultiplier);
                }else{
                    tempResult=(currentNumber*nextMultiplier);
                }

                //multiplicationResult+=tempResult;

            }
            if(tempResult>highestNumber){
                highestNumber=tempResult;
            }
            tempResult=0;//reset the temp multiplication result
        }

        return highestNumber;

    }

    /*private void multiply(int currentResult,int nextMultiplier){
        int result;
        result=currentResult*nextMultiplier;
        return multiply(result,nexxxxt);
    }*/

    private void processNumbers(){
        numberSeriesText =new ArrayList<String>();
        numberSeries=new ArrayList<Integer>();
        try {
            BufferedReader reader = null;
            reader = new BufferedReader(new FileReader("C:/Users/u314351/Desktop/numbers.txt"));

            String line = null;

            while ((line = reader.readLine()) != null) {
                numberSeriesText = Arrays.asList(line.split(""));
            }
            for(String s:numberSeriesText){
                if(!(s.equals(""))){
                    numberSeries.add(Integer.parseInt(s));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

}
