package q01_basic.question02;

public class SystemMain02 {

	public static void main(String[] args) {

		Member member = new Member();

		System.out.println("---SHOW DATA---");
		System.out.println("***MENBER DATA***");
		member.setName("Miura Manabu");
		member.setAge(30);
		member.setRank(1);

		member.showMember();

		System.out.println("*****************");
		System.out.println(">>>RANK UP>>>");
		member.rankUp();

		System.out.println("---GET RANK---");
		System.out.println("newRank:" + member.getRank());

	}

}
