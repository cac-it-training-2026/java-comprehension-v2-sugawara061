package q02_advanced.question02;

public class SystemMain02 {

	public static void main(String[] args) {

		//TODO ここから実装する

		ConsoleReader cr = new ConsoleReader();

		Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		Member[] members = { member1, member2 };

		// 表示
		System.out.println("===会員情報を表示します===");
		MemberManager.showAllMembers(members);

		// パスワード変更
		System.out.println("===パスワードを変更します===");

		int targetId;
		String newPassword;

		try {
			System.out.print("input target id>>");
			targetId = cr.inputNumber();

			System.out.print("input new password>>");
			newPassword = cr.inputString();

		} catch (Exception e) {
			System.out.println("不正な入力です");
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(members, targetId, newPassword);

		// 再表示
		System.out.println("---SHOW DATA---");
		MemberManager.showAllMembers(members);
	}

}
