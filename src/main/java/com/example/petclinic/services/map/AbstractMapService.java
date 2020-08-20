package com.example.petclinic.services.map;

import com.example.petclinic.models.BaseEntity;
import com.example.petclinic.services.CrudService;

import java.util.*;

/**
 * @author Tocka Ayman
 * @date 8/11/20
 */
public abstract class AbstractMapService implements CrudService {

    protected Map<Long, BaseEntity> map = new HashMap<>();

    @Override
    public Set<BaseEntity> findAll() {
        return new HashSet<>(map.values());
    }

    @Override
    public BaseEntity findById(Long id) {
        return map.get(id);
    }

    @Override
    public Boolean existsById(Long id) {
        return map.containsKey(id);
    }

    @Override
    public BaseEntity save(BaseEntity object) {
        if (object != null && object.getId() == null) {
            object.setId(getNextId());
        }

        map.put(object.getId(), object);

        return object;
    }

    @Override
    public void deleteById(Long id) {
        map.remove(id);
    }

    @Override
    public void delete(BaseEntity object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        if (map.size() == 0) {
            return 1L;
        }
        return Collections.max(map.keySet()) + 1L;
    }
}
