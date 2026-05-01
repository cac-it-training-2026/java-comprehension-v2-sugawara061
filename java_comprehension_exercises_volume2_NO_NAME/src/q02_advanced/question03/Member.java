package q02_advanced.question03;

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
	 * 
	 */
	public Member() {
	}

	/**
	 * @param id
	 * @param password
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
		return "Member [id=" + id + ", password=" + password + ", name=" + name
				+ ", age=" + age + ", rank=" + rank + ", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(this.toString());
	}

	public static Member getInstance(int id, String password, String name, int age, int rank) {
		Member member = new Member(id, password, name, age, rank);

		member.coupons.add(Coupon.getInstance(1, 0.5, "最初の特典"));
		member.coupons.add(Coupon.getInstance(2, 0.25, "今月の特典"));

		return member;
	}

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
