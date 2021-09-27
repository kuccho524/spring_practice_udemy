package demo;

import java.util.ArrayList;

import eintity.Member;
import service.MemberService;
import service.MemberServiceImpl;

public class Main {

	public static void main(String[] args) {
		
		// MemberServiceImpl�^�����ϐ�service��錾
//		MemberServiceImpl service = new MemberServiceImpl();
		MemberService service = MemberServiceImpl.getInstance();
		System.out.println(service.greet(2));

		System.out.println(service.getAll());
		ArrayList<Member> list  = service.getAll();
		
		// for���Ŕz��̒l�����o��
		for(Member mem : list) {
			System.out.println(mem.getId() + ","  + mem.getName() + "," + mem.getEmail());
		}
		
		// sumOf�̒l���o��
		System.out.println(service.sumOf(3,  5));
	}

}
