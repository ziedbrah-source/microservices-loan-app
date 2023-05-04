package com.alibou.clientapplicationservice.client;


import com.alibou.clientapplicationservice.DocData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "database-service", url = "${application.config.database-server-url}")
public interface DatabaseClient {

    @PostMapping("/docData")
    void addDoc(@RequestBody DocData data);
}
