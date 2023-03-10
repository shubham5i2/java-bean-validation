package com.example.demo.validation.annotation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UserNameValidator implements ConstraintValidator<UserName, String> {

    @Override
    public boolean isValid(String userName, ConstraintValidatorContext context) {
        boolean isValidUsername = true;

        if (userName == null) {
            /**
             * Null check validation is handled through default @NotNull annotation so return true to skip this validation
             */
            return true;
        }
        if (userName.length() < 5) {
            isValidUsername = false;
            context.buildConstraintViolationWithTemplate("{username.size.invalid}")
                    .addPropertyNode("name")
                    .addConstraintViolation()
                    .disableDefaultConstraintViolation();
        }

        return isValidUsername;
    }
}
