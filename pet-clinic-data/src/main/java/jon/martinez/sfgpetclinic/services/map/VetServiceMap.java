package jon.martinez.sfgpetclinic.services.map;

import jon.martinez.sfgpetclinic.model.Vet;
import jon.martinez.sfgpetclinic.services.CrudService;
import jon.martinez.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import javax.sql.rowset.CachedRowSet;
import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
