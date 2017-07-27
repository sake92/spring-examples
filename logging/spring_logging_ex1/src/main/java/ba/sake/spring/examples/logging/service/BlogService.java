package ba.sake.spring.examples.logging.service;

import java.util.List;

import ba.sake.spring.examples.logging.domain.model.BlogPost;

public interface BlogService {

	List<BlogPost> findPosts();

}
