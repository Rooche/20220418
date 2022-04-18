package co.edu.friend;

public class ComFriend extends Friend {

	private String company;
	private String department;
	
	public ComFriend() {
		super();
	}

	public ComFriend(String name, String phone, String company, String department) {
		super(name, phone);
		this.company = company;
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void setName(String name) {
		super.setName("이름은" + name);
	}
	
	@Override
	public String toString() {
	//	return "ComFriend [company=" +  company + ", name=" + name ", department=" + department + "]";
		return "회사동료 [이름 : " + super.getName() + ", 연락처 : " + super.getPhone() + ", 회사 : " +  company +  ", 부서 : " + department + "]";
	}

}
