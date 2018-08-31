package polyargument;

import java.util.Vector;

class Product{
	int price;					// 제품의 가격
	int bonusPoint;				// 제품 구매시 발생하는 포인트 점수
	
	Product(){
		// default
	}
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);	// 10%의 포인트가 계산됨
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	Computer(int price){
		super(price);
	}
	public String info() {
		return "Computer : "+super.price+", Point : "+super.bonusPoint;

	}
	
	public String toString() {
		return "Computer";
	}
}

class Tv extends Product {
	Tv(){
		super(100);
	}
	Tv(int price){
		super(price);
	}
	
	public String info() {
		return "Tv : "+super.price+", Point : "+super.bonusPoint;
	}
	
	public String toString() {
		return "Tv";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	Audio(int price){
		super(price);
	}
	
	public String info() {
		return "Audio : "+super.price+", Point : "+super.bonusPoint;

	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer{
	int money=1000;
	int bonusPoint=0;
	Vector<Product> item=new Vector<Product>();
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액부족으로 구입불가능");
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item.add(p);
		System.out.println(p+"을/를 구입함");;
	}
	
	void refund(Product p) {
		if(item.remove(p)) {
			money+=p.price;
			bonusPoint-=p.bonusPoint;
			System.out.println(p+"를 반품함");
		}else {
			System.out.println("구입 제품 중 "+p+"가 존재하지 않음");
		}
	}
	
	void summary() {
		int sum=0;
		String itemList="";
		
		if(item.isEmpty()) {	// Vector가 비어있는지를 확인
			System.out.println("구입한 제품이 없음");
		}
		
		// 반복문 이용, 구입한 물품의 총 가격과 목록 생성
		
//		for (Product p:item) {
//			sum+=p.price;
//			
//		}
		
		for(int i=0;i<item.size();i++) {
			Product p=item.get(i);
			sum+=p.price;
			itemList+= (i==0) ? ""+p : ", "+p;	// i=0이면 p를 그대로 대입(처음은 컴마가 필요없음.) 아니면 , p 대입
			
			
		}
		
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다." );
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
		
	
	}
	
}
public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b=new Buyer();
		Tv tv=new Tv(500);
		Computer com=new Computer(500);
		Audio audio=new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
		
	}
}
