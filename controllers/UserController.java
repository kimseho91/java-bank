package bank.controllers;

import javax.swing.JOptionPane;
import bank.domains.CustomerBean;
import bank.domains.MemberBean;
import bank.service.MemberService;
import bank.serviceimpl.MemberServiceImpl;

public class UserController {
	public static void main(String[] args) {
		MemberService memberservice = new MemberServiceImpl();
		MemberBean memberbean = null;
		CustomerBean customerBean = null;
		String[] arr = null;
		String temp = "";
		while(true) {
			switch (JOptionPane.showInputDialog("은행 업무 시스템\n " 
												+ "0.종료\n " 
												+ "1.회원가입\n " 
												+ "2.총 고객수\n " 
												+ "3.\n"
												+ "4.\n"
												+ "5.\n"
												+ "6.\n"
												+ "7.\n"
												+ "8.\n"
												+ "9.")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1":
				arr = JOptionPane
							.showInputDialog("아이디,비밀번호,이름,주민등록번호를 입력하세요.")
							.split(",");
				memberbean = new MemberBean();
				memberbean.setId(arr[0]);
				memberbean.setPass(arr[1]);
				memberbean.setName(arr[2]);
				memberbean.setSsn(arr[3]);
				JOptionPane.showMessageDialog(null, "회원가입 성공");
				break;
			case "2":
				break;
			case "3":
				break;
			case "4":
				break;
			case "5":
				break;
			case "6":
				break;
			case "7":
				break;
			case "8":
				break;
			case "9":
				break;
			default:
				break;
			}
		}
	}
}
