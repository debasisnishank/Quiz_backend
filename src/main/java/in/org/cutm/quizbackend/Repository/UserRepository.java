package in.org.cutm.quizbackend.Repository;

import in.org.cutm.quizbackend.Entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInfo,Integer> {
}
