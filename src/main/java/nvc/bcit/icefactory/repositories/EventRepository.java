package nvc.bcit.icefactory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.bcit.icefactory.models.Event;

public interface EventRepository extends JpaRepository<Event, Integer>{
    
}
