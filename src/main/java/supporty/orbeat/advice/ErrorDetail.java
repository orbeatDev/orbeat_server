package supporty.orbeat.advice;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDetail {
    String field;
    String message;
    String invalidValue;
}
