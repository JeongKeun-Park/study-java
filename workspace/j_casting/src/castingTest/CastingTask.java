package castingTest;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스, 모두 영상이다.

// 사용자가 선택한 영상이
// 1. 애니메이션이라면, "자막 지원" 기능 사용
class Animation extends Video {
	// 메소드
	void printSubtitle() {
		System.out.println("자막 지원");
	}
}

// 2. 영화라면, "4D" 기능 사용
class Film extends Video {
	// 메소드
	void shake() {
		System.out.println("4D");
	}
}

// 3. 드라마라면, "굿즈" 기능 사용
class Drama extends Video {
	// 메소드
	void sellGoods() {
		System.out.println("굿즈");
	}
}

public class CastingTask {

//	이 세 종류의 영상 중 사용자가 선택한 한 가지가 들어온다.
	void getService(Video video) {
//		Video의 클래스가 하위 클래스들을 가지고 있기 때문에 하위클래스들이 상위클래스로 간주된다.
		if(video instanceof Animation) {
//			video에 Animation이 들어가 있는지 확인하는 조건문
			Animation animation = (Animation)video;
			animation.printSubtitle();
		}else if(video instanceof Film) {
//			video에 Film이 들어가 있는지 확인하는 조건문
			Film film = (Film)video;
			film.shake();
		}else if(video instanceof Drama) {
//			video에 Drama이 들어가 있는지 확인하는 조건문
			Drama drama = (Drama)video;
			drama.sellGoods();
		}
	}

	public static void main(String[] args) {
		new CastingTask().getService(new Animation());
//		CastingTask casting = new CastingTask();
////		casting.getService(new Animation());
//		Animation ani = new Animation();
//		casting.getService(ani);
	}
}












