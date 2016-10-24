//

class Cwrite {
	public static void main (String a[]){
		int i,j,n = 0;
		char c;
		for (j = 0; j < 20000; j++){
			for(i = 0; j < 80; i++){
				c = (char)(n %43 + 48);
				
				System.out.print(c);
				n++;
			}
			System.out.println();
		}
	}
}
