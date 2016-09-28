class Asc {
	public static void main (String a[]){
		//variables
		int i;// integer i
		char c;//character c
		//for loop
		for (i = 0; i < 256; i++){
			c = (char)i;
			System.out.println(i+"="+c+" ");
			if(i % 10 == 0){System.out.println();}
			//System.out.print(" ");System.out.print(c);System.out.println();System.out.print(" ");
		}
	}
}
