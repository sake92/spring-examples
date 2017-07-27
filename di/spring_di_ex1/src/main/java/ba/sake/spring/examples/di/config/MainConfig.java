package ba.sake.spring.examples.di.config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import ba.sake.spring.examples.di.domain.model.BlogPost;
import ba.sake.spring.examples.di.service.BlogService;
import ba.sake.spring.examples.di.service.ServicePackage;

@Configuration
@ComponentScan(basePackageClasses = ServicePackage.class)
public class MainConfig {

	/*
	 * You could also EXPLICITLY specify which IMPLEMENTATION to use for a
	 * specific bean...
	 */
	/*
	@Bean
	@Primary // this is needed to choose this bean over BlogServiceImpl
	public BlogService blogService() {
		// this is just an example...
		return new BlogService() {
			@Override
			public List<BlogPost> findPosts() {
				return Arrays.asList(new BlogPost(123, "anonymousssss"));
			}
		};
	}
	*/

}
