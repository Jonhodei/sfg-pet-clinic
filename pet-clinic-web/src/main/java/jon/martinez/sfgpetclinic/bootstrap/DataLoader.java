package jon.martinez.sfgpetclinic.bootstrap;

import jon.martinez.sfgpetclinic.model.Owner;
import jon.martinez.sfgpetclinic.model.Vet;
import jon.martinez.sfgpetclinic.services.OwnerService;
import jon.martinez.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private  final OwnerService ownerService;
    private final VetService vetService;


    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {



        Vet vet1 = new Vet();
        vet1.setFirstname("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstname("Jessie");
        vet2.setLastName("Porter");

        vetService.save(vet2);


        System.out.println("Loaded Vets...");

        Owner owner1 = new Owner();
        owner1.setFirstname("Juan");
        owner1.setLastName("Pazos");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstname("Miguel");
        owner2.setLastName("Roman");

        ownerService.save(owner2);






    }
}
