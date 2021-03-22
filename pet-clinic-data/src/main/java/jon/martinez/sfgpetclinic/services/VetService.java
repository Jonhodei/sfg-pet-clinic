package jon.martinez.sfgpetclinic.services;

import jon.martinez.sfgpetclinic.model.Owner;
import jon.martinez.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
}
