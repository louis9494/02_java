package edu.kh.oarr.run;

import edu.kh.oarr.mode.service.MemberService;

public class MemberRun {
	public static void main(String[] args) {
		
		MemberService service = new MemberService();
		service.displayMenu();
	}

}
