package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class ProdDB implements DB{

    public String getData(){
        return "Prod Data";
    }
}
