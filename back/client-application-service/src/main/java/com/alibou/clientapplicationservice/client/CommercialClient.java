package com.alibou.clientapplicationservice.client;


import com.alibou.clientapplicationservice.DocData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "commercial-service", url = "${application.config.commercial-service-url}")
public interface CommercialClient {

    @PostMapping
    Integer score(@RequestBody DocData doc);
}
