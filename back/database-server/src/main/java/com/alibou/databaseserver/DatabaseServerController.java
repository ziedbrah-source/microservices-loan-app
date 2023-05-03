package com.alibou.databaseserver;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1/DatabaseServer")
@RequiredArgsConstructor
public class DatabaseServerController {
    private final DatabaseServerService service;
    @PostMapping("/docData")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveDoc(
            @RequestBody DocData doc
    ) {
        service.saveDoc(doc);
    }
    @PostMapping("/generatedData")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveDoc(
            @RequestBody GeneratedData doc
    ) {
        service.saveGenerated(doc);
    }
    @GetMapping("/{fullName}")
    public ResponseEntity<List<GeneratedData>> getGenDocs(
            @PathVariable("fullName") String fullName
    ) {
        System.out.println(fullName);
        return ResponseEntity.ok(service.getDocs(fullName));
    }

}