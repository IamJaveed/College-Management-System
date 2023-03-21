package staff.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import staff.student.entity.College;
@Repository

public interface CollegeRepository extends JpaRepository<College, Long>{
	

}
