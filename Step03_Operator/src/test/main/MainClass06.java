package test.main;
/*
 *  6. 3항 연산자 테스트
 */
public class MainClass06 {

	public static void main(String[] args) {
		boolean isWait=true;
		//3항 연산자는 둘중의 하나만 사용하고 싶을때 사용
		String result= isWait ? "기달려요" : "기다리지 않아요";
		System.out.println(result);
		
		String result2=null;
		if(isWait) {
			result2="기다려요";
		}else {
			result2="기다리지 않아요";
		}
		System.out.println(result2);
		
		double result3=isWait ? 10.12 : 99.5;
	}

}
