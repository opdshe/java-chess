package utils;

import exceptions.NotSupportedOperationException;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class ValidatorTest {
	@Test
	public void 지원하지_않는_동작_요청시_예외_발생() {
		//given
		String notSupportedOperation = "지원하지 않는 동작";
		String[] splitOperation = notSupportedOperation.split(" ");

		//when & then
		assertThatExceptionOfType(NotSupportedOperationException.class)
				.isThrownBy(() -> Validator.validateOperation(splitOperation));
	}

	@Test
	public void 지원하는_동작_요청시_예외_발생하지_않음() {
		//given
		String supportedOperation = "start";
		String[] splitOperation = supportedOperation.split(" ");

		//when
		boolean isValid = Validator.validateOperation(splitOperation);

		//then
		assertThat(isValid).isTrue();
	}
}