package Potenze;

public class Potenze {
	private int num;
	
	/**
	 * Constructor to made the number
	 * @param num
	 */
	public Potenze(int num) {
		this.num = num;
	}
	
	/**
	 * return number number raised to the second
	 * @return num^2
	 */
	public int pow() {
		return this.num*this.num;
	}
	
	/**
	 * set number
	 * @param num
	 */
	public void setnum(int num) {
		this.num = num;
	}
	
	/**
	 * get number
	 * @return num
	 */
	public int getnum() {
		return this.num;
	}
	
}
