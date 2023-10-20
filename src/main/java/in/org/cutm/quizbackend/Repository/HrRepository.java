package in.org.cutm.quizbackend.Repository;

import in.org.cutm.quizbackend.Entity.HrInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HrRepository extends JpaRepository<HrInfo,Integer> {
}
