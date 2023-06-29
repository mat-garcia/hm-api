package com.matdev.hmapi.repository;

import com.matdev.hmapi.entity.reserva.ReservaDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaDAO, Long > {


}
