package jon.martinez.sfgpetclinic.services;

import jon.martinez.sfgpetclinic.model.Owner;
import jon.martinez.sfgpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet owner);
    Set<Pet> findAll();
}
