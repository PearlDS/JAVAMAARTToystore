package toyStore.services.implemantations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toyStore.data.User;
import toyStore.repositories.Userrepository;
import toyStore.services.interfaces.UserSerice;

@Service
public class UserServiceImplV1 implements UserSerice {


    private Userrepository userrepository;
    @Autowired
    public UserServiceImplV1(Userrepository userrepository) {
        this.userrepository = userrepository;
    }

    @Override
    public User getUserByUserNameAndPassword(String userNme, String pasword) {
        return userrepository.findByUserNameAndPassWord(userNme,pasword);
    }
}
