package com.alibou.clientapplicationservice.client;


import com.alibou.clientapplicationservice.DocData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ocr-service", url = "${application.config.ocr-service-url}")
public interface OcrClient {

    @PostMapping
    DocData checkOcr(@RequestBody DocData doc);
}
