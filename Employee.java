package practiceday6;
import java.util.Arrays;
public class Employee {
	String name;
	long[] phoneNo;
	String passportNo;
	int licenseNo;
	String panCardNo;
	int votedId,employeeId;
	public Employee(String name, long[] phoneNo, String passportNo, int employeeId) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.passportNo = passportNo;
		this.employeeId = employeeId;
	}
	public Employee(String name, long[] phoneNo, int licenseNo, String panCardNo, int employeeId) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
		this.employeeId = employeeId;
	}
	public Employee(String name, long[] phoneNo, int licenseNo, int votedId, int employeeId) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.votedId = votedId;
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		if(this.passportNo!=null) {
			return "Name = " + name + "\nPhoneNo = " + Arrays.toString(phoneNo) + "\nPassportNo = " + passportNo
					+ "\nEmployeeId = "
					+ employeeId;
		}
		else if(this.panCardNo!=null) {
			return "Name = " + name + "\nPhoneNo = " + Arrays.toString(phoneNo) 
			+ "\nLicenseNo = " + licenseNo + "\nPanCardNo = " + panCardNo + "\nEmployeeId = "
			+ employeeId;
		}
		else {
			return "Name = " + name + "\nPhoneNo = " + Arrays.toString(phoneNo) 
					+ "\nLicenseNo = " + licenseNo  + "\nVotedId = " + votedId + "\nEmployeeId = "
					+ employeeId;
		}
	}
}
