package q02_advanced.question03;

import java.util.List;

public class MemberManager {
	//インスタンス禁止
	private MemberManager() {

	}

	//showAllMembers メソッドを定義、showMember メソッドを呼び出し
	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
			System.out.println("******************");
		}
	}

	//updatePassword メソッドを定義、オブジェクトを取得
	public static void updatePassword(List<Member> members, int targetId, String newPassword) {
		boolean found = false;

		for (Member member : members) {
			if (member.getId() == targetId) {
				member.setPassword(newPassword);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("該当者はいませんでした。");
		}
	}
}
