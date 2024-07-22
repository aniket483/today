package practiceday6;
import java.util.Random;
import java.lang.*;
public class Register<T> {
	private String registerId;
	public void display(T obj) {
		System.out.println(obj.toString());
	}
	public String generateRegisterId(int n) {
		String chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		StringBuilder registerId=new StringBuilder();
		Random rand=new Random();
		for(int i=0;i<n;i++) {
			registerId.append(chars.charAt(rand.nextInt(chars.length())));
			
		}
		return registerId.toString();
	}

}

