package com.hoanglam.CarService.controller;

import com.hoanglam.CarService.model.Toyota;
import com.hoanglam.CarService.repository.ToyotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ToyotaController {

    @Autowired
    private ToyotaRepository toyotaRepository;

    @PostMapping("/employees")
    public Toyota saveEmployee(@RequestBody Toyota toyota){
        toyotaRepository.saveEmployee(toyota);
        return toyota;
    }

    @GetMapping("/employees")
    public List<Toyota> findAll(){

        return toyotaRepository.findAll();
    }

    @PutMapping("/employee}")
    public void update(@RequestBody Toyota toyota){

        toyotaRepository.update(toyota);
    }

    @DeleteMapping("/employees/{name}")
    public void delete(@PathVariable("name") String name){

        toyotaRepository.delete(name);
    }

}
