package es.hayn.poc.annotation;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

class ProcessorTest {

    @Test
    void whenProcessingAObjectWithNeverNullThenPopulateNullFieldsWithDefault() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        final var animal = new Animal("id", "name", null);
        Processor.runNeverNull(animal);

        assert animal.getId().equals("id");
        assert animal.getName().equals("name");
        assert animal.getOther().equals("");
    }
}
