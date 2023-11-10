package com.example.vii;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "your-index-name")
public class YourDocumentEntity {
    @Id
    private String id;
    
    // Other fields and getters/setters
}

