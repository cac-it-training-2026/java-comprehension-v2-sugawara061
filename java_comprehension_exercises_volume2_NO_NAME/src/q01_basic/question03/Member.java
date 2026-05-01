package q01_basic.question03;

class Member {
	private String name;
	private int age;
	private int rank;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	public Member() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void showMember() {

		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("rank:" + rank);
	}
}
