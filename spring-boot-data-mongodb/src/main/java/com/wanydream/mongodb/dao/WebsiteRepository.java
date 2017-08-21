package com.wanydream.mongodb.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wanydream.mongodb.entity.Website;

public interface WebsiteRepository extends MongoRepository<Website, String> {

}
