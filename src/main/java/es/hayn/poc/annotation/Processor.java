package es.hayn.poc.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Processor {

    public static void runNeverNull(Object object) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        final var clazz = object.getClass();
        for (Field field: clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(NeverNull.class)) {
                final var fieldType = field.getType();
                if (field.get(object) == null) {
                    field.set(object, fieldType.getDeclaredConstructor().newInstance());
                }
            } else {
                System.out.println("No NeverNull");
            }
        }
    }
}
