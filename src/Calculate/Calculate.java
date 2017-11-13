package Calculate;

import java.util.Scanner;

public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		int x, y;
		String operator;
		while (true) {
			System.out.println("������ �� ���� �Է��Ͻÿ�.");
			x = input.nextInt();
			y = input.nextInt();
			System.out.println("������ �����ڸ� �Է��Ͻÿ�. (+, -, *, /)");
			operator = input.next();
			if (operator.equals("+")) {
				System.out.println(x + " + " + y + " = " + add(x, y));
			} else if (operator.equals("-")) {
				System.out.println(x + " - " + y + " = " + sub(x, y));
			} else if (operator.equals("*")) {
				System.out.println(x + " * " + y + " = " + mul(x, y));
			} else if (operator.equals("/")) {
				System.out.println(x + " / " + y + " = " + div(x, y));
			} else {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		input.close();
	}

	public static int add(int x, int y) {

		return x+y;
	}

	public static int sub(int x, int y) {

		return x-y;
	}

	public static int mul(int x, int y) {

		return x*y;
	}

	public static double div(int x, int y) {
		if(Math.abs((double)y)>=0.000001){
			return (double) x/(double) y;
		}
		else{
			return 0;
		}
		
	}
}
