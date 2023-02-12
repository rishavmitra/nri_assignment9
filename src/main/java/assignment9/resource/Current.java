package assignment9.resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("current")
public class Current implements Account{
@Override
	public String toString() {
		return "Current";
	}

	//	@Qualifier("showcurr")
	public void showAccount() {
		System.out.println("This is a current account");
	}
}
