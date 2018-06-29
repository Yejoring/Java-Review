package abstractpractice;

public class Tank extends Unit {
	void move(int x, int y) {
		this.x+=1/2*x;
		this.y+=1/2*y;
	}
	void changeMode() {
		
	}
}
