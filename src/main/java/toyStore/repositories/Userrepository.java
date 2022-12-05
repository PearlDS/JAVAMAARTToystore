package toyStore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import toyStore.data.User;

@Repository
public interface Userrepository extends JpaRepository<User, Integer> {

    User findByUserNameAndPassWord(String userName, String passWord);
}
