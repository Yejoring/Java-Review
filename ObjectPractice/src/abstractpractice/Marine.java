package abstractpractice;

public class Marine extends Unit {
	void move(int x, int y) {
		this.x=2*x;
		this.y=2*y;
	}
	
	void stimPack() {
		// 스팀팩을 사용
	}
}
