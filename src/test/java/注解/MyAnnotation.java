package 注解;

import java.lang.annotation.*;

/**
 * @Author: cola
 * @Created: cola on 2021/5/12 21:52
 * @Version 1.0
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation {

    /**
     *
     * @return
     */
    String name() default "";

    /**
     *
     * @return
     */
    int age() default 0;

}
