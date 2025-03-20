import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner str = new Scanner(System.in);
		System.out.print("数字を入力してください。");
		int a = str.nextInt();
		
		System.out.print("演算子を入力してください。");
		String ope = str.next();
		
		System.out.print("数字を入力してください。");
		int b = str.nextInt();
		
		if(ope.equals("+")) {
			System.out.println(Calculation.add(a, b));
			
		} else if(ope.equals("-")) {
			System.out.println(Calculation.sub(a, b));
			
		} else if(ope.equals("×")) {
			System.out.println(Calculation.mul(a, b));
			
		} else if(ope.equals("÷")) {
			try {
				System.out.println(Calculation.div(a, b));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
