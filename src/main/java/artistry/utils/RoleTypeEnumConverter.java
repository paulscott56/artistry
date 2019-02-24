package artistry.utils;

import artistry.enums.Role;
import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

public class RoleTypeEnumConverter extends AbstractBeanField<String> {

	@Override
	protected Object convert(String value) throws CsvDataTypeMismatchException {
		try {
			return Role.valueOf(value);
		} catch(RuntimeException e) {
			throw new CsvDataTypeMismatchException(e.getMessage());
		}
	}

}
