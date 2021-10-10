/**
 * MeasureWhileLoopTime
 */
import java.lang.System;

public class MeasureWhileLoopTime {
  public static void main(String[] args) {
      long startTime = System.nanoTime();
      long cTM = System.currentTimeMillis();
      int i = 0;
      while( i < 1000){
      i++;

      };
    long estimatedTime =    System.nanoTime()          - startTime;
      System.out.println(estimatedTime);
    long estimatedTimecTM = System.currentTimeMillis() - cTM; 
      System.out.println("on the other hand, currenTimeMills is: "
       + estimatedTimecTM);
  }


    
}