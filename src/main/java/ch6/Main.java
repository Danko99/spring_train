package ch6;

import ch6.models.Comment;
import ch6.services.CommentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProjectConfigCh6.class);
        CommentService commentService = applicationContext.getBean(CommentService.class);

        Comment comment = new Comment("text of comment","Danko");
        commentService.publishComment(comment);
    }
}
