package com.efrain.crud.validation;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.efrain.crud.entities.Product;


@Component
public class ProductValidation implements Validator{

    // Método que da soporte a la clase que se validara
    @Override
    public boolean supports(Class<?> clazz) {
       return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
      Product product = (Product) target;
      ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "es requerido!");
      // ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "NotBlank.product.description");
      if (product.getDescription() == null || product.getDescription().isBlank()){
        errors.rejectValue("description", null, "es requerido! por favor, (desde la clase product validación)");
      }

      if(product.getPrice() == null ){
        errors.rejectValue("price", null, "no puede ser nulo, ok! (desde la clase product validación)");
      }else if(product.getPrice() < 1){
        errors.rejectValue("price", null,"el valor debe ser mayor que uno!");
      }
    }
}