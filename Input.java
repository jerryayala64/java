class Input {
	public static void main (String a[]){
	String input1, input2, input3, input4, input5;
	int sum;
		input1 = a[0]; input2 = a[1]; input3 = a[2]; input4 = a[3]; input5 = a[4];
		int b = Integer.parseInt(input1);
			int c = Integer.parseInt(input2);
				int d = Integer.parseInt(input3);
					int e = Integer.parseInt(input4);
						int f = Integer.parseInt(input5);
		System.out.println(input1+input2+input3+input4+input5);
		sum = b+c+d+e+f;
		int factorial = b*c*d*e*f;
		int diff = b-c-d-e-f;
		int div = b/c/d/e/f;
		System.out.println("sum:"+sum);
		System.out.println("diff:"+diff);
		System.out.println("factorial:"+factorial);
		System.out.println("div:"+div);
	}
}
