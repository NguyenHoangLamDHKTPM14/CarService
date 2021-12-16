package com.hoanglam.CarService.repository;

import com.hoanglam.CarService.model.Kia;
import com.hoanglam.CarService.model.Toyota;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToyotaRepository {
    public static  List<Toyota> toyotas ;
    private HashOperations hashOperations;

    private RedisTemplate redisTemplate;
    public ToyotaRepository() {
        this.toyotas = new ArrayList<>();
        this.hashOperations = redisTemplate.opsForHash();
        this.redisTemplate = redisTemplate;
    }

    public void saveEmployee(Toyota toyota){
//        toyotas.add(toyota);
        hashOperations.put("TOYOTA", toyota.getName(), toyota);
    }
    public List<Toyota> findAll(){
        return hashOperations.values("TOYOTA");
    }

    public void update(Toyota toyota){
//       toyotas.forEach(e->{
//           if(e.equals(toyota.getName())){
//               toyotas.remove(e);
//           }
//       });
//       toyotas.add(toyota);
       saveEmployee(toyota);
    }
    public void delete(String name){
//        toyotas.forEach(e->{
//            if(e.equals(name)){
//                toyotas.remove(e);
//            }
//        });
        hashOperations.delete("TOYOTA", name);
    }

}
