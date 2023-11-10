package com.example.vii;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface YourDocumentRepository extends ElasticsearchRepository<YourDocumentEntity, String> {
}
