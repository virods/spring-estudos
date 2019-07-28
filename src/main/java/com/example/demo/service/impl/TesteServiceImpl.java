package com.example.demo.service.impl;

import com.example.demo.service.TesteService;
import org.springframework.stereotype.Service;

@Service
public class TesteServiceImpl implements TesteService {

    @Override
    public int retornaNumeroDobrado(int n) {
        return n*2;
    }
}
