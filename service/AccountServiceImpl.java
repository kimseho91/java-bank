package bank.service;


import bank.beans.AccountBean;
import bank.beans.MemberBean;

public class AccountServiceImpl implements AccountService {
	private AccountBean[] Accounts;
	private int count;
	
	public AccountServiceImpl() {
		Accounts = new AccountBean[10];
		count = 0;
	}
	

	@Override
	public void createAccount(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override //계좌번호 생성
	public String createAccountNum() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
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
