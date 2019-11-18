package com.alpi.annotations;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = NameValidator.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NonEmpty {
    String message() default "Name null or empty";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
