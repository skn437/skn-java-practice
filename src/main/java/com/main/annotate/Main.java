package com.main.annotate;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

  public static void main(String[] args)
    throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    Skn skn = new Skn("Wang So", 29.5, "4th Prince");

    System.out.printf("Name: %s \n", skn.getName());

    //* This is how an annotation is checked in a class
    if (skn.getClass().isAnnotationPresent(VeryImportant.class)) {
      System.out.printf("Annotation is present! \n");
    } else {
      System.out.printf("Annotation is not present");
    }

    //* This is how an annotaion is checked and invoked in a method
    //* As methods are more than one, that's why they must be lopped over
    //* To get the parameter value, you need to first get the method
    for (Method method : skn.getClass().getDeclaredMethods()) {
      if (method.isAnnotationPresent(MyHeart.class)) {
        MyHeart myHeart = method.getAnnotation(MyHeart.class);

        for (int i = 0; i < myHeart.times(); i++) {
          method.invoke(skn);
        }
      }
    }

    //* This is how an annotaion is checked in a field
    //* As fields are more than one, that's why they must be lopped over
    //* To get the correct type of the field, first an `object` must be created and then typed cast later with `instanceof`
    //* Not Recommended way, because the field must be public. Use Annotation on methods instead
    for (Field field : skn.getClass().getDeclaredFields()) {
      if (field.isAnnotationPresent(MyName.class)) {
        Object object = field.get(skn);

        if (object instanceof String stringValue) {
          System.out.printf("My Name: %s \n", stringValue.toUpperCase());
        }
      }
    }
  }
}
