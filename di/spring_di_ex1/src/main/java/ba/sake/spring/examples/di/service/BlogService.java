package ba.sake.spring.examples.di.service;

import java.util.List;

import ba.sake.spring.examples.di.domain.model.BlogPost;

public interface BlogService {

	List<BlogPost> findPosts();

}
