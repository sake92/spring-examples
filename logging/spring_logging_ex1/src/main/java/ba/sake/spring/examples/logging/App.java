package ba.sake.spring.examples.logging;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ba.sake.spring.examples.logging.config.MainConfig;
import ba.sake.spring.examples.logging.domain.model.BlogPost;
import ba.sake.spring.examples.logging.service.BlogService;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
		BlogService myService = ctx.getBean(BlogService.class);
		List<BlogPost> findPosts = myService.findPosts();
		findPosts.forEach(System.out::println); // voila :)
	}

}
