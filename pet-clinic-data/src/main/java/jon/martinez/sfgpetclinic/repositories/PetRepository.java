package jon.martinez.sfgpetclinic.repositories;

import jon.martinez.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
