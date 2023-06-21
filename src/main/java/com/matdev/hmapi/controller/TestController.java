package com.matdev.hmapi.controller;

import com.matdev.hmapi.model.JsonTesteDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class TestController {

    @GetMapping("test")
    public ResponseEntity<Object> getTest(){
        return new ResponseEntity<>("spring boot!",HttpStatus.OK);
    }

    @PostMapping("test")
    public ResponseEntity<Object> postTest(  @RequestBody JsonTesteDTO jsonTesteDTO){

        return new ResponseEntity<>(jsonTesteDTO,HttpStatus.OK);
    }
}
