package com.example.petclinic.bootstrap;

import com.example.petclinic.models.Owner;
import com.example.petclinic.models.Vet;
import com.example.petclinic.services.OwnerService;
import com.example.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Tocka Ayman
 * @date 8/17/20
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        loadOwners();
        loadVets();

        System.out.println("owners count = " + ownerService.findAll().size());
        System.out.println("vets count = " + vetService.findAll().size());
    }

    public void loadOwners() {
        Owner owner1 = new Owner();

        owner1.setFirstName("Radwa");
        owner1.setLastName("Ayman");

        ownerService.save(owner1);

        Owner owner2 = new Owner();

        owner2.setFirstName("Hossam");
        owner2.setLastName("Hassan");

        ownerService.save(owner2);
    }

    public void loadVets() {
        Vet vet1 = new Vet();

        vet1.setFirstName("Mohamed");
        vet1.setLastName("Gamal");

        vetService.save(vet1);

        Vet vet2 = new Vet();

        vet2.setFirstName("Ahmed");
        vet2.setLastName("Ramy");

        vetService.save(vet2);
    }
}
