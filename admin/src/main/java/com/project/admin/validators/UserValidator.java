package com.project.admin.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

// Replace occurences of "YourModel" with a valid model
import com.project.admin.models.YourModel;

@Component
public class UserValidator implements Validator{	
	@Override
	public boolean supports(Class<?> clazz) {
		return YourModel.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		YourModel yourModel = (YourModel) object;
		
		// Example:
		// if(!YourModel.getSomeField().equals(YourModel.getSomeOtherField())){
		// 	errors.rejectValue("someField","Match");
		// }
	}
}
