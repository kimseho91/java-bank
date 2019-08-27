package bank.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import bank.domains.AccountBean;
import bank.domains.MemberBean;
import bank.service.AccountService;

public class AccountServiceImpl implements AccountService {
	private AccountBean[] Accounts;
	private int count;
	private String reuslt;
	
	public AccountServiceImpl() {
		Accounts = new AccountBean[10];
		count = 0;
	}

	@Override
	public void createAccount(int money) {
		AccountBean acc = new AccountBean();
		acc.setAccountNum(createAccountNum());
		acc.setMoney(money+"");
		acc.setToday(findDate());
		Accounts[count] = acc;
		count++;
	}

	@Override //계좌번호 생성
	public String createAccountNum() {
		String accountNum = "";
		Random random = new Random();
		for(int i = 0;i<9;i++) {
			accountNum += (i==4)?"-":random.nextInt(10);
			/*int t = random.nextInt(10);
			if(i==4) {
				accountNum += "-";
			}else {
				accountNum += t;
			}*/
		}
		return accountNum;
	}

	@Override
	public AccountBean[] findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override//오늘날짜, 현재시간(분까지) 반환
	public String findDate() {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm")
				.format(new Date());
	}

	@Override
	public void depositMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}
