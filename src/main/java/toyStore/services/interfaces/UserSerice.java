package toyStore.services.interfaces;

import toyStore.data.User;

public interface UserSerice {

    User getUserByUserNameAndPassword(String userNme, String pasword);
}
