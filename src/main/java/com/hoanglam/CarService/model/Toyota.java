package com.hoanglam.CarService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Toyota extends Car{
    @Override
    int getCost() {
        return 0;
    }
}