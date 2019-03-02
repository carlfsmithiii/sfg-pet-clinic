package com.example.petclinic.services.map;

import com.example.petclinic.model.Visit;
import com.example.petclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null) {
            throw new RuntimeException("Invalid visit -- Pet is null");
        }
        if (visit.getPet().getOwner() == null) {
            throw new RuntimeException("Invalid visit -- Owner is null");
        }
//        if (visit.getPet().getId() == null) {
//            throw new RuntimeException("Invalid visit -- PetId is null");
//        }
        if (visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException("Invalid visit -- OwnerId is null");
        }

//        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
//                || visit.getPet().getOwner().getId() == null) {
//            throw new RuntimeException("Invalid visit");
//        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
