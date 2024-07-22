package practiceday6;
import java.util.Arrays;
public class Student {
	String name;
	long[] phoneNo;
	String passportNo;
	int licenseNo;
	String panCardNo;
	int votedId;
	public Student(String name, long[] phoneNo, String passportNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.passportNo = passportNo;
	}
	public Student(String name, long[] phoneNo, int licenseNo, String panCardNo) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.panCardNo = panCardNo;
	}
	public Student(String name, long[] phoneNo, int licenseNo, int votedId) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.licenseNo = licenseNo;
		this.votedId = votedId;
	}
	@Override
	public String toString() {
		if(this.passportNo!=null) {
			return "Name = " + name + "\nPhoneNo = " + Arrays.toString(phoneNo) + "\nPassportNo = " + passportNo;
		}
		else if(this.panCardNo!=null) {
			return "Name = " + name + "\nPhoneNo = " + Arrays.toString(phoneNo) 
			+ "\nLicenseNo = " + licenseNo + "\nPanCardNo = " + panCardNo;
		}
		else {
			return "Name = " + name + "\nPhoneNo = " + Arrays.toString(phoneNo) 
					+ "\nLicenseNo = " + licenseNo  + "\nVotedId = " + votedId;
		}
	}
	
	
	

}
