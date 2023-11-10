package com.example.vii;


import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface YourEntityRepository extends ElasticsearchRepository<YourEntity, String> {
}
