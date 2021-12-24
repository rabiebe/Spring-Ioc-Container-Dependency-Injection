package metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dao.IDao;

@Component("metier")
public class MetierImpl implements IMetier{

	@Autowired
    private IDao iDao;
    
    @Override
    public String sayHello() {
        return iDao.sayHello().concat(", ").concat("don't worry about dependency injection,I already link the business layer with the dao layer, Happy coding :)");
    }

    public void setDao(IDao iDao) {
        this.iDao = iDao;
    }
}
