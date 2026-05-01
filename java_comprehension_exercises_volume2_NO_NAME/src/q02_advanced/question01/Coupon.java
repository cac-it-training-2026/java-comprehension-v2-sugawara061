package q02_advanced.question01;

public class Coupon {
	private int id;
	private double discountRate;
	private String description;

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return discountRate
	 */
	public double getDiscountRate() {
		return discountRate;
	}

	/**
	 * @param discountRate セットする discountRate
	 */
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * @return discription
	 */
	public String getDiscription() {
		return description;
	}

	/**
	 * @param discription セットする discription
	 */
	public void setDiscription(String discription) {
		this.description = discription;
	}

	/**
	 * 
	 */
	public Coupon() {
	}

	/**
	 * @param id
	 * @param discountRate
	 * @param discription
	 */
	public Coupon(int id, double discountRate, String discription) {
		this.id = id;
		this.discountRate = discountRate;
		this.description = discription;
	}

	@Override
	public String toString() {
		return "Coupon [getId()=" + getId() + ", getDiscountRate()=" + getDiscountRate() + ", getDiscription()="
				+ getDiscription() + "]";
	}

}
