package com.alibou.creditShower;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/v1/showCredit")
@RequiredArgsConstructor
public class CreditShowerController {
    private final CreditShowerService service;


    @GetMapping("/{fullName}")
    public ResponseEntity<List<GeneratedData>> findAllByName(
            @PathVariable("fullName") String fullName
    ) {
        return ResponseEntity.ok(service.findDataByName(fullName));
    }

}
