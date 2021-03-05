package top.lihaijian.enableimport;

/**
 * EnalbeFruit
 *
 * @author haijian.li
 * @version 1.0
 * 2021/3/5 2:09
 **/

import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Import({Apple.class,Test.class})
public @interface EnalbeFruit {
}
