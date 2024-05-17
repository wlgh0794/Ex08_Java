package chap08_static;

import chap08_static.car.CarStatic;

public class _01_Static {

	public static void main(String[] args) 
	{
		
		// 1. 클래스 변수와 메소드의 사용
		
		// 클래스 변수와 메소드는 클래스명 . 변수명 . 클래스명 . 메소드로 접근한다.
		
		CarStatic.grade = "B" ; // [ 클래스의 변수를 외부에서 가져오는 방법 ]
		
		CarStatic.printCurrentGrade();

		// 2 . 인스턴스 변수나 메소드는 클래스 원형으로 접근 및 사용이 불가능하다.
		
//		CarStatic.Company = "현대" ;
//		CarStatic.model = "제네시스";
//		CarStatic.carInfo() ;
		
		
		// 3 . 인스턴스 변수와 메소드는 객체 생성 후에 사용한다.
		
		CarStatic car = new CarStatic() ;
		
		car.Company = "현대" ;
		
		car.model = "제네시스" ;
		
		car.color = "검정" ;
		
		car.price = 5000 ;
		
		car.carInfo();
		
	}

}
