package ¿¬½À;

import java.lang.annotation.*;

@Target({ElementType.METHOD})
@Retention(RententionPolicy.RUNTIME)
public @interface PrintAnnotation {
	String value() default "-";
	int number() default 15;
}
