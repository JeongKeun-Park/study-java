package n_anonymous;

public class Computer {
	public static void main(String[] args) {
//		up casting
		Game rpg = new Game() {
//			익명 클래스
			
			@Override
			public void play() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void exit() {
				// TODO Auto-generated method stub
				
			}
			
		};
		System.out.println(rpg instanceof Game);
	}
}
