package com.example.vii;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/document")
public class DocumentController {

    @Autowired
    private YourEntityRepository yourEntityRepository;

    @PostMapping("/create")
    public ResponseEntity<String> createDocument(@RequestBody YourEntity document) {
        // Save the document to Elasticsearch
        YourEntity savedDocument = yourEntityRepository.save(document);

        return ResponseEntity.ok("Document created successfully with ID: " + savedDocument.getId());
    }
      @GetMapping("/{id}")
    public ResponseEntity<YourEntity> getDocumentById(@PathVariable String id) {
        // Retrieve document by ID
        YourEntity document = yourEntityRepository.findById(id).orElse(null);

        if (document != null) {
            return ResponseEntity.ok(document);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
