package com.alibou.commercialservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.concurrent.ThreadLocalRandom;
@RestController
@RequestMapping("/api/v1/CommercialService")
@RequiredArgsConstructor
public class CommercialServiceController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Integer> saveDoc(
            @RequestBody DocData doc
    ) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, 101);
        return ResponseEntity.ok(randomNum);
    }


}