package supporty.orbeat.advice;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 오류 응답시 반환될 형식 정의
 */
@Getter
@Setter
public class ErrorResponse {

    private int code;
    private String message;
    private String requestUrl;
    private String statusCode;
    private String resultCode;

    private List<FieldError> errorList;

    @Builder
    public ErrorResponse(int code, String message, List<FieldError> errors) {
        this.code = code;
        this.message = message;
        this.errorList = initErrors(errors);
    }

    public ErrorResponse() {}

    private List<FieldError> initErrors(List<FieldError> errors) {
        return (errors == null) ? new ArrayList<>() : errors;
    }

    @Getter
    @Setter
    public static class FieldError {
        private String field;
        private String value;
        private String reason;
        private String message;
        private String invalidValue;

        @Builder
        public FieldError(String field, String value, String reason, String message, String invalidValue) {
            this.field = field;
            this.value = value;
            this.reason = reason;
            this.message = message;
            this.invalidValue = invalidValue;
        }

        public FieldError() {}

    }

    // 일반 Exception
    public static ErrorResponse ErrorOf(int code, String message) {
        return ErrorResponse.builder()
                .code(code)
                .message(message)
                .build();
    }

    // DTO Exception
    public static ErrorResponse FieldErrorOf(int code, String message, List<FieldError> errors) {
        return ErrorResponse.builder()
                .code(code)
                .message(message)
                .errors(errors)
                .build();
    }

}
