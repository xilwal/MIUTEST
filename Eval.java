public class Main {
  
  public static void main(String[] args) {
    
    System.out.println(eval(-3, new int[]{3,2,1})); //output 18
  }

  static double eval(double x, int[]a){
    double sum = 0;
    double evalNum = 1;
    for(int i = 0; i < a.length; i++){
        sum = sum + (a[i]*evalNum);
        evalNum = evalNum * x;
    }
    return sum;
  }
}
