package org.springframework.beans;

import java.lang.reflect.Field;

import org.springframework.core.MethodParameter;
import org.springframework.core.convert.ConversionException;
import org.springframework.core.convert.ConverterNotFoundException;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

/**
 * Base implementation of the {@link TypeConverter} interface, using a package-private delegate.
 * Mainly serves as base class for {@link BeanWrapperImpl}.
 *
 * @author Juergen Hoeller
 * @since 3.2
 * @see SimpleTypeConverter
 */
public abstract class TypeConverterSupport extends PropertyEditorRegistrySupport implements TypeConverter {

	@Nullable
	TypeConverterDelegate typeConverterDelegate;


	@Override
	@Nullable
	public <T> T convertIfNecessary(@Nullable Object value, @Nullable Class<T> requiredType) throws TypeMismatchException {
		return doConvert(value, requiredType, null, null);
	}

	@Override
	@Nullable
	public <T> T convertIfNecessary(@Nullable Object value, @Nullable Class<T> requiredType, @Nullable MethodParameter methodParam)
			throws TypeMismatchException {

		return doConvert(value, requiredType, methodParam, null);
	}

	@Override
	@Nullable
	public <T> T convertIfNecessary(@Nullable Object value, @Nullable Class<T> requiredType, @Nullable Field field)
			throws TypeMismatchException {

		return doConvert(value, requiredType, null, field);
	}

	@Nullable
	private <T> T doConvert(@Nullable Object value,@Nullable Class<T> requiredType,
			@Nullable MethodParameter methodParam, @Nullable Field field) throws TypeMismatchException {

		Assert.state(this.typeConverterDelegate != null, "No TypeConverterDelegate");
		try {
			if (field != null) {  // field
				return this.typeConverterDelegate.convertIfNecessary(value, requiredType, field);
			}
			else { // methodParam
				return this.typeConverterDelegate.convertIfNecessary(value, requiredType, methodParam);
			}
		}
		catch (ConverterNotFoundException | IllegalStateException ex) {
			throw new ConversionNotSupportedException(value, requiredType, ex);
		}
		catch (ConversionException | IllegalArgumentException ex) {
			throw new TypeMismatchException(value, requiredType, ex);
		}
	}

}
