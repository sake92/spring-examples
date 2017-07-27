package ba.sake.spring.examples.di.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import ba.sake.spring.examples.di.domain.model.BlogPost;

@Service
// @Component would also work
public class BlogServiceImpl implements BlogService {

	private List<BlogPost> posts = new ArrayList<BlogPost>();

	public BlogServiceImpl() {
		posts.add(new BlogPost(1, "Blah"));
		posts.add(new BlogPost(1, "aaaaaaa"));
	}

	public List<BlogPost> findPosts() {
		return posts;
	}

}
