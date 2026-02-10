public class Main{
	public static void main(String[] args) {
		int[] a = {111, 115, 118, 127, 125};
		System.out.println(isDecodeArray(a)); //output 3344
	}

	public static int isDecodeArray(int[] a){
		
        if(a.length < 2)
			return 0;
            
		int number = 0;
        int sign = a[0] < 0 ? -1: 1;
        
		for(int i = 0; i<a.length-1; i++){
			int diff = a[i] - a[i+1];
            if(diff < 0)
            	diff = diff * -1;
			number = number * 10 + diff;
		}

		return number*sign;
	}
}