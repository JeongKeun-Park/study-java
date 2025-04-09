package inhTest;

class Hero {
	int hp;
	int dmg;
	
	public Hero() {;}
	
	public Hero(int hp, int dmg) {
		this.hp = hp;
		this.dmg = dmg;
	}

	void getDmg(int dmg) {
		this.hp -= dmg;
	}
	
	int attack() {
		return dmg;
	}
}

class Thor extends Hero {
	int hammerCount;
	int shildCount;
	
	public Thor() {;}
	
	public Thor(int hp, int dmg, int hammerCount, int shildCount) {
		super(hp, dmg);
		this.hammerCount = hammerCount;
		this.shildCount = shildCount;
	}

	@Override
	void getDmg(int dmg) {
		if(shildCount <= 0) {
			super.getDmg(dmg);
			return;
		}
		dmg -= shildCount;
		super.getDmg(dmg);
		shildCount--;
	}
	
	@Override
	int attack() {
		int dmg = super.attack();
		
		if(hammerCount > 0) {
			dmg = hammerCount == 1 ? dmg + 1 : (dmg * hammerCount);
			hammerCount--;
			return dmg;
		}
		
		return dmg;
	}
}

// 원하는 히어로 만들기
// Hero 클래스를 상속받아서 구현한다.


public class InhTest03 {
	public static void main(String[] args) {
		Thor thor = new Thor(10, 5, 2, 2);
		thor.getDmg(10);
		
		System.out.println(thor.hp);
		System.out.println(thor.shildCount);
		
		System.out.println("입힌 데미지: " + thor.attack());
		System.out.println(thor.hammerCount);
		System.out.println("입힌 데미지: " + thor.attack());
		System.out.println(thor.hammerCount);
		System.out.println("입힌 데미지: " + thor.attack());
		System.out.println(thor.hammerCount);
		
	}
}



















