package com.example.vii;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/index")
public class IndexController {

    @Autowired
    private YourEntityRepository yourEntityRepository;

    @PostMapping("/create")
    public ResponseEntity<String> createIndex() {
        // Create an instance of YourEntity
        YourEntity entity = new YourEntity();
        // Set values if needed

        // Save the entity to create the index
        yourEntityRepository.save(entity);

        return ResponseEntity.ok("Index created successfully");
    }
}