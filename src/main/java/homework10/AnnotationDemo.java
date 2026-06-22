/** @author Irakli Barbakadze */
package homework10;

import java.lang.reflect.Method;

/** 0.5 ქულა · Custom Annotation
 ორი ფაილი:
 •
 @interface Author — String name() და String date() default "unknown".
 @Retention(RUNTIME) + @Target(METHOD).
 •
 AnnotationDemo — class 2 მეთოდით, თითო @Author(name="...")-ით.
 main()-ში reflection-ით წაიკითხე annotation-ი: method.getAnnotation(Author.class).name(). */

public class AnnotationDemo {
    @AuthorAnnotation.Author(name = "Irakli", date = "1994-07-17")
    public void method1() {
    }


    @AuthorAnnotation.Author(name = "lazare")
    public void method2() {
    }

    public static void main(String[] args) {

        Method[] methods = AnnotationDemo.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(AuthorAnnotation.Author.class)) {

                AuthorAnnotation.Author author = method.getAnnotation(AuthorAnnotation.Author.class);

                System.out.println(
                        method.getName()
                                + " -> " + author.name()
                                + " | " + author.date()
                );
            }
        }
    }
}
