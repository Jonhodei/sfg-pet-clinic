package jon.martinez.sfgpetclinic.repositories;

import jon.martinez.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
