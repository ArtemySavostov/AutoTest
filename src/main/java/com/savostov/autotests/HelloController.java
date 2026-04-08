package com.savostov.autotests;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

        @GetMapping("/api/hello")
        public ResponseEntity<Void> hello() {

            return ResponseEntity.ok().build();
        }
    }
