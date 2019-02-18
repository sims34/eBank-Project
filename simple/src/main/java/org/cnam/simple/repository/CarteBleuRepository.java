package org.cnam.simple.repository;

import org.cnam.simple.model.CarteBleuModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface CarteBleuRepository extends JpaRepository<CarteBleuModel,Long> {

    CarteBleuModel findByIdCarteBleu(UUID idCarte);
}
