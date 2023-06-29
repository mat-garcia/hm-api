package com.matdev.hmapi.controller;

import com.matdev.hmapi.entity.reserva.ReservaDAO;
import com.matdev.hmapi.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;


    @GetMapping
    public List<ReservaDAO> listReserva(){

        return reservaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ReservaDAO> Reservaid(@PathVariable("id") Long id){

        return reservaService.findByid(id);
    }

}
