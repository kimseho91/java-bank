package bank.beans;

public class CustomerBean extends MemberBean {
	private String credit;

	public void setCredit(String credit) {
		this.credit = credit;
	}

	public String getCredit() {
		return credit;
	}
}
