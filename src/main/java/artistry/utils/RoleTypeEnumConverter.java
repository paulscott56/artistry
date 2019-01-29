package artistry.utils;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvConstraintViolationException;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

import artistry.enums.Role;

public class RoleTypeEnumConverter extends AbstractBeanField<String> {

	@Override
	protected Object convert(String value) throws CsvDataTypeMismatchException, CsvConstraintViolationException {
		try {
			return Role.valueOf(value);
		} catch(RuntimeException e) {
			throw new CsvDataTypeMismatchException(e.getMessage());
		}
	}

}
