//compile javac TrigTableRad.java
//run java TrigTableRad
class TrigTableRad {

	public static void main (String args[]){
		double c,s,t; //temp double for cosine, sine and tangent so they can be rounded
		int d = 0; //degrees
		double r = 0, rround = 0; //radian measure
		double pi = 3.141592653589793238462643383279502884197169399375105820974;
		double i = (pi/12); //increment r 15 degrees equals pi radians
		String un = "UN";
		System.out.println("radian measurement is represented as rad");
		System.out.println("\t\t rad \t\t| cos(radian) \t\t| sin(rad) \t\t  | tan(rad)");
		System.out.println("----------------------------------------------------------------------------------");
		while (r <= (2*pi)){
			//convert angle t to radians r
			c = Math.cos(r);
			c = (Math.round(c *1000.0))/1000.0;
			s = Math.sin(r);
			s = (Math.round(s *1000.0))/1000.0;
			t = Math.tan(r);
			t = (Math.round(t *1000.0))/1000.0;
			rround = (Math.round(r*1000.0))/1000.0;
			
			if((rround == 1.571) || (rround == 4.712))
			{System.out.println("\t"+rround+"\t|\t"+ c +"\t|\t"+ s +"\t|\t UN");
		}else{
			System.out.println("\t" +rround+ "\t|\t" +c+ "\t|\t" +s+ "\t|\t" +t);
		}
			r = r + i;
		}
	}
}
