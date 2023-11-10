package com.example.vii;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "your-index-name")
public class YourEntity {

    @Id
    private String id;
    public String field1;
    public String field2;
    public String getId() {
        
        return id;
    }

    // Add other fields as needed

    // Getters and setters
}
