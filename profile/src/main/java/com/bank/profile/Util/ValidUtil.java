package com.bank.profile.Util;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ValidUtil {

    public static Errors getErrorsForJson(BindingResult bindingResult) {
        Errors errors = new Errors();
        for (FieldError error : bindingResult.getFieldErrors()) {
            errors.addError(error.getField(), error.getDefaultMessage());
        }
        return errors;
    }

    private static class Errors implements Serializable {

        private final Map<String, String> errors = new HashMap<>();
        public void addError(String name, String value) {
            errors.put(name, value);
        }

        public Map<String, String> getErrors() {
            return errors;
        }
    }

}
