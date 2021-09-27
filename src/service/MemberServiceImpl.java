package service;

import java.util.ArrayList;

import eintity.Member;

public class MemberServiceImpl implements MemberService {

	// MemberServiceImpl�^��singleton��錾
	private static MemberServiceImpl singleton = new MemberServiceImpl();
	private MemberServiceImpl() {};
	
	// MemberServiceImpl��getInstance���\�b�h���`
	public static MemberServiceImpl getInstance() {
		return singleton;
	}
	
	@Override
	public String greet(int i) {
		// ����������z��^�Œ�`
		String[] greetings = { "Good Morning", "Hello", "Good evening" };
		return greetings[i];
	}

	@Override
	public ArrayList<Member> getAll() {
		
		// Member���C���X�^���X������
		ArrayList<Member> list = new ArrayList<>();
		Member mem1 = new Member(1, "Linda", "linda@example.com");
		Member mem2 = new Member(2, "James", "jamas@examole.com");
		list.add(mem1);
		list.add(mem2);
		
		return list;
	}

	@Override
	public int sumOf(int x, int y) {
		// sum=0��錾
		int sum = 0;
		
		// y�ȉ��̏ꍇ�ɌJ��Ԃ�for�����쐬
		for(int i  = x; i <= y; i++) {
			sum += i;
		}
		
		// sum��Ԃ�
		return sum;
	}

}
