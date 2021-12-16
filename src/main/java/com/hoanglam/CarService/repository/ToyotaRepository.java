package com.hoanglam.CarService.repository;

import com.hoanglam.CarService.model.Kia;
import com.hoanglam.CarService.model.Toyota;

import java.util.ArrayList;
import java.util.List;

public class ToyotaRepository {
    public static  List<Toyota> toyotas ;
    public ToyotaRepository() {
        toyotas = new ArrayList<>();
    }

    public void saveEmployee(Toyota toyota){
        toyotas.add(toyota);
    }
    public List<Toyota> findAll(){
        return toyotas;
    }

    public void update(Toyota toyota){
       toyotas.forEach(e->{
           if(e.equals(toyota.getName())){
               toyotas.remove(e);
           }
       });
       toyotas.add(toyota);
    }
    public void delete(String name){
        toyotas.forEach(e->{
            if(e.equals(name)){
                toyotas.remove(e);
            }
        });
    }

}
