package org.cnam.simple.repository;

import org.cnam.simple.model.SimpleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SimpleRepository extends JpaRepository<SimpleModel, Long> {

    //List<SimpleModel> findByData(final String data);
}
