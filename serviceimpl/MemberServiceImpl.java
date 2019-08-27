package bank.serviceimpl;

import bank.domains.AdminBean;
import bank.domains.CustomerBean;
import bank.domains.MemberBean;
import bank.service.MemberService;

public class MemberServiceImpl implements MemberService {
	private CustomerBean[] customers;
	private AdminBean[] admins;
	private int custCount, adCount;

	public MemberServiceImpl() {
		customers = new CustomerBean[10];
		admins = new AdminBean[10];
		custCount = 0;
		adCount = 0;
	}
	
	@Override
	public void join(CustomerBean param) {
		customers[custCount]=param;
		custCount++;
	}
	
	@Override
	public CustomerBean[] findAllCustomers() {
		customers = new CustomerBean[10];
		for(int i=0; i<custCount;i++) {
			customers[i]=customers[i];
		}
		return customers;
	}

	@Override
	public AdminBean[] findAllAdmins() {
		admins = new AdminBean[10];
		for(int i=0; i<adCount;i++) {
			admins[i]=admins[i];
		}
		return admins;
	}
	
	
	@Override //고객, 사원 공용 메소드
	public MemberBean[] findByName(String name) {
		int count1 = 0, count2 = 0, count3 = 0;
		for (int i = 0; i < custCount; i++) {
			if (name.equals(customers[i].getName())) {
				count1++;
				break;
			}
		}
		for (int i = 0; i < adCount; i++) {
			if (name.equals(admins[i].getName())) {
				count2++;
				break;
			}
		}
		count3 = count1 + count2;
		MemberBean[] members = new MemberBean[count3];
		int j = 0;
		for (int i = 0; i < custCount; i++) {
			if (name.equals(customers[i].getName())) {
				members[j] = customers[i];
				j++;
				if (count1 == j) {
					break;
				}
			}
		}
		int k = 0;
		for (int i = 0; i < adCount; i++) {
			if (name.equals(admins[i].getName())) {
				members[j] = admins[i];
				k++;
				j++;
				if (count2 == k) {
				}
				break;
			}
			break;
		}
		return members;
	}

	@Override //고객, 사원 공용 메소드
	public MemberBean findById(String id) {
		MemberBean c = new MemberBean();
		for (int i = 0; i <custCount; i++) {
			if(id.equals(customers[i].getId())) {
				c = customers[i];
				break;
				}
		}
		for(int i = 0; i <adCount; i++) {
			if(id.equals(admins[i].getId())) {
				c = admins[i];
				break;
				}
		}
		return c;
	}

	@Override
	public boolean login(MemberBean param) {
		return findById(param.getId())
				.getPass()
				.equals(param.getPass());
	}
	
	@Override // 고객수
	public int countMembers() {
		return custCount;
	}

	@Override // 직원수
	public int countAdmins() {
		return adCount;
	}
	
	@Override
	public boolean existId(String id) {
		boolean flag = false;
		for (int i = 0; i <custCount; i++) {
			if(id.equals(customers[i].getId())) {
				flag = true;
				break;
				}
		}
		for(int i = 0; i <adCount; i++) {
			if(id.equals(admins[i].getId())) {
				flag = true;
				break;
				}
		}
		return flag;
	}

	@Override
	public void updatePass(MemberBean param) {
		String id = param.getId();
		String[] pas= param.getPass().split(",");
		String oldPass = pas[0];
		String newPass = pas[1];
		param.setPass(oldPass);
		if(login(param)) {
			for (int i = 0; i <custCount; i++) {
				if(id.equals(customers[i].getId())) {
					customers[i].setPass(newPass);
					break;
					}
			}
			for(int i = 0; i <adCount; i++) {
				if(id.equals(admins[i].getId())) {
					admins[i].setPass(newPass);
					break;
					}
			}
			findById(param.getId()).setPass(newPass);
		}
	}

	@Override
	public void deleteMember(MemberBean param) {
		
	}

	@Override
	public void register(AdminBean param) {
		// TODO Auto-generated method stub
		
	}

}
