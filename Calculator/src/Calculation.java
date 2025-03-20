//計算
public class Calculation {
	
	//和
	public static int add(int a, int b) {
		return a+b;
	}
	
	//差
	public static int sub(int a, int b) {
		return a-b;
	}
	
	//積
	public static int mul(int a, int b) {
		return a*b;
	}
	
	//商
	public static int div(int a, int b) throws Exception {
		//0で割るとき
		if(b==0) {
			throw new IllegalArgumentException("0で割ることはできません。");
		}
		
		return a/b;
		
	}
}
