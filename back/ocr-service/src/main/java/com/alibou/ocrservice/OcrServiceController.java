package com.alibou.ocrservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/OcrService")
@RequiredArgsConstructor
public class OcrServiceController {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<DocData> saveDoc(
            @RequestBody DocData doc
    ) {
        return ResponseEntity.ok(doc);
    }


}