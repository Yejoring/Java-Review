package abstractpractice;

public class Dropship extends Unit {
	void move(int x, int y) {
		this.x+=x;
		this.y+=y;
	}
	void load() {
		// 지정 대상을 태운다
	}
	void unload() {
		// 선택 대상을 내려준다
	}
	
}
