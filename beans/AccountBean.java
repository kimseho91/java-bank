package bank.beans;

public class AccountBean {
	private String accountNum,today,money;
	
	public void setAccount(String account) {
		this.accountNum = accountNum;
	}
	public String getAccount() {
		return accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return today;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getMoney() {
		return money;
	}
	
	@Override
	public String toString() {
		return String.format("계좌번호:%s\n"
							+ "거래일:%s\n"
							+ "돈:%s", accountNum,today,money);
	}
}
