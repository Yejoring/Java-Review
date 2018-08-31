package innerclass;

public class InnerEx1 {
/*
 * 이너 클래스의 종류와 특징  
 * 내부 클래스의 종류는 변수의 선언 위치에 따른 종류와 같다.
 * 인스턴스 이너 클래스 : 외부클래스의 멤버변수 선언위치에 선언. 외부클래스의 인스턴스 멤버처럼 다뤄짐. 
 				  외부 클래스의 인스턴스 멤버들과 관련된 작업에서 사용될 목적
 				
 * 스태틱 이너 클래스 : 외부 클래스의 멤버변수 선언 위치에 선언. 외부 클래스의 static 멤버처럼 다뤄진다.
 
 * 지역 클래스 : 외부 클래스의 메서드나 초기화 블럭 안에 선언. 선언된 영역 내부에서만 사용 가능하다.
 
 * 익명 클래스 : 클래스의 선언과 객체의 생성을 동시에 하는 이름없는 클래스로 일회용이다.
 
 선언 위치의 변수와 동일한 유효범위와 접근성을 갖는다.
 접근제어자는 인스턴스 멤버와 static 멤버간의 같은 위치에 선선되고 멤버변수와 같은 성질을 갖는다.
 
 내부클래스도 클래스이기 때문에 abstract와 final 같은 접근 제어자도 사용 가능.
 private와 protected 같은 접근 제어자도 사용이 가능.
 * */
	
	class InstanceInner{
		int iv=100;
		static int cv=100;
		final static int CONST=100;
	}
	
	static class StaticInner{
		int iv=200;
		static int cv=200;
	}
	
	void myMethod() {
		class LocalInner{
			int iv=300;
			static int cv=300;
			final static int CONST=300;
		}
	}
	
	public static void min(String args[]) {
		System.out.println(InstanceInner.CONST);
		System.out.println(StaticInner.cv);
	}
	
	
	/*
	 * 내부 클래스 중 스태틱 클래스만 static 멤버를 가질 수 있다. 다만 final과 static이 동시에 붙은 변수는 상수여서 모든 내부클래스에서 정의가 가능.*/
}
