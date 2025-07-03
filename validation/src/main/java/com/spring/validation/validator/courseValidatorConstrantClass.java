package com.spring.validation.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class courseValidatorConstrantClass implements ConstraintValidator<CourseValidator,String> {
    private String coursePrefix;

    @Override
    public void initialize(CourseValidator constraintAnnotation) {
    coursePrefix=     constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        Boolean result= s.startsWith(coursePrefix);
        return result;
    }
}
