package com.alibou.clientapplicationservice;

import com.alibou.clientapplicationservice.client.DatabaseClient;
import com.alibou.clientapplicationservice.client.CommercialClient;
import com.alibou.clientapplicationservice.client.OcrClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientApplicationService {

    private final DatabaseClient dbClient;
    private final CommercialClient commercialClient;
    private final OcrClient ocrClient;

    public boolean check(DocData data) {

        dbClient.addDoc(data);
        ocrClient.checkOcr(data);
        if(commercialClient.score(data)>=50) return true;
        return false;

    }
}