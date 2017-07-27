package ba.sake.spring.examples.logging.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import ba.sake.spring.examples.logging.domain.model.BlogPost;

@Service
public class BlogServiceImpl implements BlogService {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	private List<BlogPost> posts = new ArrayList<BlogPost>();

	public BlogServiceImpl() {
		posts.add(new BlogPost(1, "Blah"));
		posts.add(new BlogPost(1, "aaaaaaa"));
	}

	public List<BlogPost> findPosts() {
		logger.info("Called findPosts()");
		return posts;
	}

}
