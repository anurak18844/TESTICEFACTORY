package nvc.bcit.icefactory.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.bcit.icefactory.models.Camera;

public interface CameraRepository extends JpaRepository<Camera, Integer>{
    
}
