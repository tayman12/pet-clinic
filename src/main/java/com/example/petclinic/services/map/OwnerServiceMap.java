package com.example.petclinic.services.map;

import com.example.petclinic.models.Owner;
import com.example.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

/**
 * @author Tocka Ayman
 * @date 8/11/20
 */
@Service
public class OwnerServiceMap extends AbstractMapService implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
