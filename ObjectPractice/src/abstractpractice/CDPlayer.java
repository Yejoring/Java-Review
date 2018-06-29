package abstractpractice;

public class CDPlayer extends Player {
	void play(int currentPos) {
		//조상클래스 구현
	}
	
	void stop() {
		// 조상클래스 메서드 구현
	}
	
	int currentTrack;
	void nextTrack() {
		currentTrack++;
		
	}
	void preTrack() {
		if(currentTrack>1) {
			currentTrack--;
		}
		//...
		
	}
}
