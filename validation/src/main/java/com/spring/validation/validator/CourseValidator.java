package com.spring.validation.validator;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = courseValidatorConstrantClass.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseValidator {

    public String value() default "LUV";

    public String message() default "should contain LUV as PreFix";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

}
