import java.util.Arrays;

public class Main {
	
    public static void main(String[] args) {
       
        int[] computeHMS = computeHMS(3650); //output {1,2,15}

        System.out.println(Arrays.toString(computeHMS));
    }
  
    public static int[] computeHMS(int seconds) {
    
      if(seconds < 0)
          return new int[0];

      int h = 0;
      int m = 0;
      int s = 0;
      int sec = seconds;

      h = sec/3600;
      sec = sec%3600;
      m = sec/60;
      sec = sec%60;
      s = sec;

      int[] result = new int[3];
      result[0] = h;
      result[1] = m;
      result[2] = s;
      
      return result;
      
    }
    
}