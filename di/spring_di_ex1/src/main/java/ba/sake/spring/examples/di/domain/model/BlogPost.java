package ba.sake.spring.examples.di.domain.model;

/**
 * Let's pretend this is a JPA model for a table... :D
 * 
 * @author Sake
 *
 */
public class BlogPost {

	private long id;
	private String content;

	public BlogPost() {
		// must have for Hibernate e.g.
	}

	public BlogPost(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "BlogPost [id=" + id + ", content=" + content + "]";
	}

}
