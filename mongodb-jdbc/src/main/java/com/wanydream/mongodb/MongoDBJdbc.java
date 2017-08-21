package com.wanydream.mongodb;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;

public class MongoDBJdbc {

	public static void main(String[] args) {

		MongoClient mongoClient = new MongoClient("127.0.0.1", 27017);
		MongoDatabase mongoDatabase = mongoClient.getDatabase("WYTESTDB");

		// 创建集合
		mongoDatabase.createCollection("website");
		Document document = new Document("name", "Baidu");

		// 插入数据
		mongoDatabase.getCollection("website").insertOne(document);

		// 条件查询
		FindIterable<Document> result = mongoDatabase.getCollection("website").find(document);
		for (Document document2 : result) {
			System.out.println(document2);
		}

		// 删除
		mongoDatabase.getCollection("website").deleteOne(document);

		// 更新
		mongoDatabase.getCollection("website").updateMany(document, new Document("name", "Sina"));

		mongoClient.close();

	}

}
