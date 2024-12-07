package SHap;

public class Account {
	
private int Accno;
private String AccName;
private int AccAmount;

void setAccno(int Accno) {
	this.Accno=Accno;
}
void setAccName(String AccName) {
	this.AccName=AccName;
}

int getAccno() {
	return Accno;
}

String getAccName() {
	return AccName;
	
}	public static void main(String[] args) {
Account acc= new Account();
acc.setAccno(1000);
System.out.println(acc.getAccno());

acc.setAccName("ShahrukhKhan");
System.out.println(acc.getAccName());	
	}

}
