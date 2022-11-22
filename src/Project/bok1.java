package Project;


public class bok1 {

	private int seed;
	private int rate;
	private int year;

	
	public bok1(int seed, int rate, int year) {
		super();
		this.seed = seed;
		this.rate = rate;
		this.year = year;

	}
	public int getSeed() {
		return seed;
	}
	public void setSeed(int seed) {
		this.seed = seed;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public int money1() {
			for(int i = 1; i < year ; i++) {
			seed = (int) (seed + (seed * rate * 0.01));
		}
			return (int) (seed + (seed * rate * 0.01));
	}
	
	
	@Override
	public String toString() {
		return "복리계산기 [초기시드: " + seed + ", 수익률: " + rate + "%" + ", 매매횟수: " + year + "]";
	}

	
	
	
	
	
	
	
	
}
