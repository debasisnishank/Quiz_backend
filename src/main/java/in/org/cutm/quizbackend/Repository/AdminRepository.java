package in.org.cutm.quizbackend.Repository;

import in.org.cutm.quizbackend.Entity.AdminInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminInfo,Integer> {
}
