package ba.sake.spring.examples.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ba.sake.spring.examples.di.config.MainConfig;
import ba.sake.spring.examples.di.domain.model.BlogPost;
import ba.sake.spring.examples.di.service.BlogService;

public class App {

	/**
	 * - You WON'T DO THIS e.g. in Spring-MVC, it would be "done for you". <br>
	 * - You'd just specify configurations etc.. Great, right? :)
	 */
	public static void main(String[] args) {

		/**
		 * - first we create a context, based on a configuration <br>
		 * - config can be an XML or @Configuration class/es
		 */
		ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);

		/**
		 * - then we require from context/container a BEAN, in our case a
		 * BlogService <br>
		 * - the context will prepare/instantiate it FOR US!
		 */
		BlogService myService = ctx.getBean(BlogService.class);

		/**
		 * - since BlogServiceImpl is annotated with @Service it will be
		 * instantiated, it is the only candidate <br>
		 * - also, the @ComponentScan in MainConfig is needed !!!
		 */
		List<BlogPost> findPosts = myService.findPosts();
		findPosts.forEach(System.out::println); // voila :)
	}

}
