package sv.duaflores.appdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sv.duaflores.appdev.model.Authors;

public interface AuthorsRepository extends JpaRepository<Authors, Long> {

}
