public class Main{
	public static void main(String[] args) {
		
        int[] a = {1,11,11,111,11111,1};
	    int[] b = {-9,99,9,999};
	    int[] c = {};
	    int[] d = {11,22,11,111};
	    int[] e = {1};
	    
	    System.out.println(isVanilla(a)); //output 1
	    System.out.println(isVanilla(b)); //output 1
	    System.out.println(isVanilla(c)); //output 1
	    System.out.println(isVanilla(d)); //output 0
	    System.out.println(isVanilla(e)); //output 1
	}

	public static int isVanilla(int[] a){

		if(a.length < 2)
			return 1;

		int vanillaNumber = 0;

		for(int i = 0; i < a.length; i++){

			int num = a[i];
			int digit = 0;

			while(num > 0) {
				digit = num%10;
				num = num/10;
				if(vanillaNumber == 0){
					vanillaNumber = digit;
				}

				if(digit != vanillaNumber)
					return 0;
			}
		}
		return 1;
	}
}