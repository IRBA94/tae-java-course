/** @author Irakli Barbakadze */
package homework10;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/** 0.5 ქულა · Custom Annotation
 ორი ფაილი:
 •
 @interface Author — String name() და String date() default "unknown".
 @Retention(RUNTIME) + @Target(METHOD).
 •
 AnnotationDemo — class 2 მეთოდით, თითო @Author(name="...")-ით.
 main()-ში reflection-ით წაიკითხე annotation-ი: method.getAnnotation(Author.class).name(). */
public class AuthorAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.METHOD)
    public @interface Author {

        String name();

        String date() default "unknown";
    }
}
