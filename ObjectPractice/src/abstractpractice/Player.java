package abstractpractice;

public abstract class Player {
	boolean pause;
	int currentPos;
	
	Player(){
		pause=false;
		currentPos=0;
	}
	
	// 지정된 위치에서 재생 시작하는 기능
	abstract void play(int pos);
	abstract void stop();
	
	void play() {
		play(currentPos);	// 추상 메서드 사용가능
	}
	
	void  pause() {
		if(pause) {	// 정지상태일 때 pause호출(일시정지 해제) >
			pause=false;	// pause상태를 false로 바꾸고
			play(currentPos);	// 현재의 위치에서 play로 바꾼다
		}else {		// pause상태가 false인 경우(재생중)
			pause=true;		// 일시정지시키고
			stop();	// 멈춘다
		}
	}
}
