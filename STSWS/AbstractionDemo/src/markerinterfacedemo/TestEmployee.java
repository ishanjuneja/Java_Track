package markerinterfacedemo;

public class TestEmployee {

	public static void main(String[] args) {
		Employee [] employees={new Programmer("Pankaj"),new Tester("Rakesh"),
				new Programmer("Dinesh")};
		
		for (Employee employee : employees) {
			if(employee instanceof Expert){
			employee.doSomething();
			}
		}

	}

}
