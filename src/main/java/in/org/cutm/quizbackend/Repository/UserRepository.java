package in.org.cutm.quizbackend.Repository;

import in.org.cutm.quizbackend.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    // Custom methods for user-related operations
	public List<Users> findByUsername(String username);
}
