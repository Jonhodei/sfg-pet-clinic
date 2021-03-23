package jon.martinez.sfgpetclinic.services;

import jon.martinez.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
