package abstractpractice;

public abstract class Unit {
	/**
	 * 현재 위치 : x, y
	 * 이동하는 메서드 : abstract void move
	 * 현재위치에 정지 : void stop
	 */
	
	
	 int x;
	 int y;
	abstract void move(int x, int y);
	int[] stop() {
		int[] pos= {x,y};
		return pos;
	}
	
}
