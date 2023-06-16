package com.libman.dao;

import java.util.List;

import com.libman.models.Publishers;

public interface PublisherDao {
	int savePublishers(Publishers author);
	List<Publishers>getPublishersRecords();
	public int updatePublishers(Publishers author) ;
	public int deletePublishers(int authorId);
	public Publishers getPublishersById(int authorId);
}
