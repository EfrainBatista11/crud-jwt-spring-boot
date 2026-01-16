package com.efrain.crud.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Constraint(validatedBy = ExistsByUsernameValidation.class)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExistsByUsername {

    String message() default "¡Ups! Parece que alguien ya se adelantó y eligió ese nombre de usuario. ¿Podrías intentar con otro?";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}