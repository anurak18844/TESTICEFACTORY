package nvc.bcit.icefactory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.bcit.icefactory.models.Factory;

public interface FactoryRepository extends JpaRepository<Factory, Integer>{
    
}
