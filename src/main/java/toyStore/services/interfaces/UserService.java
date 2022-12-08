package toyStore.services.interfaces;

import toyStore.data.User;

public interface UserService {

    User getUserByUserNameAndPassword(String userNme, String pasword);
}
