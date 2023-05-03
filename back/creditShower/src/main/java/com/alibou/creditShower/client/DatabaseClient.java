package com.alibou.creditShower.client;


import com.alibou.creditShower.GeneratedData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "database-service", url = "${application.config.database-server-url}")
public interface DatabaseClient {

    @GetMapping("/{fullName}")
    List<GeneratedData> findAllDataByName(@PathVariable("fullName") String fullName);
}
