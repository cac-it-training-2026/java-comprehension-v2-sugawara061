package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;

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
	 * @return passwordString
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param passwordString セットする passwordString
	 */
	public void setPassword(String passwordString) {
		this.password = passwordString;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @return coupons
	 */
	public List<Coupon> getCoupons() {
		return coupons;
	}

	/**
	 * @param coupons セットする coupons
	 */
	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}

	/**
	 * 
	 */
	public Member() {
	}

	/**
	 * @param id
	 * @param passwordString
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = new ArrayList<>();

	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "Member [id=" + id +
				", password=" + password +
				", name=" + name +
				", age=" + age +
				", rank=" + rank +
				", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(toString());
		System.out.println("******************");
	}

	public static Member getInstance(int id, String password, String name, int age, int rank) {

		Member member = new Member(id, password, name, age, rank);

		List<Coupon> list = new ArrayList<>();
		list.add(Coupon.getInstance(1, 0.5, "最初の特典"));
		list.add(Coupon.getInstance(2, 0.25, "今月の特典"));

		member.setCoupons(list);

		return member;
	}

}
