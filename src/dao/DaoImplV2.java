package dao;

import org.springframework.stereotype.Component;

@Component("d")
public class DaoImplV2 implements IDao {

	@Override
	public String sayHello() {
		
		return "You are in version 2, if you want to go back to the previous version you have to change in the configuration file (config.txt)!";
	}

}
