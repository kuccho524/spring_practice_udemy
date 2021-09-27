package demo;

import java.util.ArrayList;

import eintity.Member;
import service.MemberService;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		// MemberServiceImpl型を持つ変数serviceを宣言
//		MemberServiceImpl service = new MemberServiceImpl();
		MemberService service = MemberServiceImpl.getInstance();
		System.out.println(service.greet(2));

		System.out.println(service.getAll());
		ArrayList<Member> list  = service.getAll();
		
		// for文で配列の値を取り出す
		for(Member mem : list) {
			System.out.println(mem.getId() + ","  + mem.getName() + "," + mem.getEmail());
		}
		
		// sumOfの値を出力
		System.out.println(service.sumOf(3,  5));
	}

}
