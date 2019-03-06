package application;

import java.util.Date;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {

		var comment1 = new Comment("Coment�rio 1");
		var comment2 = new Comment("Coment�rio 2");
		var comment3 = new Comment("Coment�rio 3");
		var comment4 = new Comment("Coment�rio 4");

		var post1 = new Post(new Date(), "Titulo post1", "Conte�do", 5);
		var post2 = new Post(new Date(), "Titulo post2", "Conte�do", 1);

		post1.addComment(comment1);
		post1.addComment(comment3);

		post2.addComment(comment2);
		post2.addComment(comment4);
		
		System.out.println(post1);
		System.out.println(post2);
	}

}
