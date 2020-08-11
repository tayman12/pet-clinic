package com.example.petclinic.services.map;

import com.example.petclinic.models.BaseEntity;
import com.example.petclinic.services.CrudService;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
    public BaseEntity save(BaseEntity object) {
        map.put(object.getId(), object);

        return object;
    }

    BaseEntity save(Long id, BaseEntity object) {
        map.put(id, object);
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
}
