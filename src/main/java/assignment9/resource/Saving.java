package assignment9.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("saving")
public class Saving implements Account{
//	@Autowired
//	@Qualifier("showsave")
	
	
	public void showAccount() {
		System.out.println("This is a Savings account");
	}

	@Override
	public String toString() {
		return "Saving";
	}
}
