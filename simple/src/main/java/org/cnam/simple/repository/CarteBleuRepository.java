package org.cnam.simple.repository;

import org.cnam.simple.model.CarteBleuModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarteBleuRepository extends JpaRepository<CarteBleuModel,Long> {
}
