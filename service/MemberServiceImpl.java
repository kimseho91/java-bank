package bank.service;

import bank.beans.AdminBean;
import bank.beans.CustomerBean;
import bank.beans.MemberBean;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members; 
	private CustomerBean[] customers;
	private AdminBean[] admins;
	private int count;
	private boolean msg;

	public MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}
	
	@Override
	public void join(CustomerBean param) {
		members[count]=param;
		count++;
	}
	
	@Override
	public CustomerBean[] findAllCustomers() {
		members = new MemberBean[10];
		for(int i=0; i<count;i++) {
			members[i]=customers[i];
		}
		return customers;
	}

	@Override
	public AdminBean[] findAllAdmins() {
		members = new MemberBean[10];
		for(int i=0; i<count;i++) {
			members[i]=admins[i];
		}
		return admins;
	}
	
	
	@Override //고객, 사원 공용 메소드
	public MemberBean[] findByName(String name) {
		int j = 0;
		for (int i = 0; i < count; i++) {
			if (name.equals(this.members[i].getName())) {
				j++;
			}
		}
		MemberBean[] members = new MemberBean[j];
		j = 0;
		for (int i = 0; i < count; i++) {

			if (name.equals(this.members[i].getName())) {
				members[j] = this.members[i];
				j++;

				if (members.length == j) {
					break;
				}

			}
			members[i] = this.members[i];
		}
		return members;
	}

	@Override //고객, 사원 공용 메소드
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (id.equals(members[i].getId())) {
				member = members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public boolean login(MemberBean param) {
		msg = false;
		for (int i = 0; i < count; i++) {
			if (param.getId().equals(members[i].getId()) && param.getPass().equals(members[i].getPass())) {
				msg = true;
				break;
			}
		}
		return msg;
	}

	@Override // 고객수
	public int countMembers() {
		
		return 0;
	}

	@Override // 직원수
	public int countAdmins() {
		
		return 0;
	}
	
	@Override
	public boolean existId(String id) {
		msg = false;
		for(int i = 0; i<count; i++) {
			if(id.equals(members[i].getId())) {
				msg = true;
				break;
			}
			
		}
		return msg;
	}

	@Override
	public void updatePass(MemberBean param) {
		String pa = param.getPass();
		String[] pas= pa.split(",");
		String oldPass = pas[0];
		String newPass = pas[1];
		for(int i = 0; i < count; i++) {
			if(param.getId().equals(members[i].getId())
					&&oldPass.equals(members[i].getPass())) {
				members[i].setPass(newPass);
				break;
			}
		}
		return;
	}

	@Override
	public void deleteMember(MemberBean param) {
		// TODO Auto-generated method stub

	}

}
