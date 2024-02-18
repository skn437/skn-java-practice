package com.main.annotate;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//* Annotation Parameters can have `primitive`, `class`, `String` & `Array` types only */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyHeart {
  int times() default 1; //* Giving a default parameter value is a good practice
}
