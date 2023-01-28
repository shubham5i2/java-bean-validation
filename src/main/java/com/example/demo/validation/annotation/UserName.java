package com.example.demo.validation.annotation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Documented
@Target({FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = UserNameValidator.class)
public @interface UserName {

    public String message() default "{username.invalid}";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};
}
