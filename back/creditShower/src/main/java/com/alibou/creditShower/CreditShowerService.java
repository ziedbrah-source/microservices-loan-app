package com.alibou.creditShower;

import com.alibou.creditShower.client.DatabaseClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CreditShowerService {

    private final DatabaseClient client;


    public List<GeneratedData> findDataByName(String fullName) {

        List<GeneratedData> data = client.findAllDataByName(fullName);
        return data;
    }
}