# Assignments
public class Book {

	public String bname;
public Book() {};
	public Book(String bname) {
		this.bname=bname;
	}

	boolean avail() { return false;}
	boolean unavail() {return true;}
	
void issueBook() {
	System.out.println("Book Issued is "+ this.bname);
	unavail();
}

void returnBook() {
	System.out.println("Book returned");
	avail();
	
	
	
	}

}




public class Member extends Book {
public String mname;

public Member(String mname) {
	this.mname=mname;
}
void getBook() {
	 if(avail()) {System.out.println("Book Available is"+ bname);}
	 else if (unavail()) {System.out.println("Book unavalable issued by "+ mname);}
}
void getMember() {
	if(unavail()) System.out.println(mname+"Has issued a book");          
	else System.out.println(mname+"Has not issued any");
}
}




public class TestBM extends Book{

	public static void main(String[] args) {
Book bk=new Book ("Alchemist");
Member m1=new Member("Mohini");
bk.issueBook();
m1.getMember();
m1.getBook();
bk.returnBook();



	}

}
