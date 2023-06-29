package com.matdev.hmapi.service;

import com.matdev.hmapi.entity.reserva.ReservaDAO;
import com.matdev.hmapi.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    public List<ReservaDAO> findAll(){
        return reservaRepository.findAll();

    }

    public Optional<ReservaDAO> findByid(Long id){
        return reservaRepository.findById(id);
    }

}
