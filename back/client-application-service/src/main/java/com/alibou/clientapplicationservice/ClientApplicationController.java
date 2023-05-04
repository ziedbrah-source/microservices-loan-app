package com.alibou.clientapplicationservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/loan")
@RequiredArgsConstructor
public class ClientApplicationController {
    private final ClientApplicationService service;


    @PostMapping
    public ResponseEntity<Resp> check(
            @RequestBody DocData data
    ) {
        Resp res=new Resp();
        res.setLoanConfirmed(service.check(data));
        return ResponseEntity.ok(res);
    }

}
