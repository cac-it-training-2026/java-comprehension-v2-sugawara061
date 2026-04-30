package q02_advanced.question02;

public class MemberManager {

	private MemberManager() {
	}

	public static void showAllMembers(Member[] members) {
		for (Member member : members) {
			member.showMember();
		}
	}

	public static void updatePassword(Member[] members, int targetId, String newPassword) {
		boolean found = false;

		for (Member m : members) {
			if (m.getId() == targetId) {
				m.setPassword(newPassword);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("該当者はいませんでした。");
		}
	}
}