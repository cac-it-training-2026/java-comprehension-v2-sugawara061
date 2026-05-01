package q01_basic.question03;

public class SystemMain03 {

	public static void main(String[] args) {

		System.out.println("---SHOW DATA(NULL)---");
		System.out.println("***MEMBER DATA*** ");
		Member menber1 = new Member();
		menber1.showMember();
		System.out.println("***************** ");
		System.out.println("---SHOW DATA(Miura)---");
		Member member2 = new Member("Miura Manabu", 28, 2);
		member2.showMember();
	}
}
