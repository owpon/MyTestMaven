package com.ziv.mypra.service.impl;

import com.ziv.mypra.service.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greeting(String word) {
        return "greeting";
    }
}
