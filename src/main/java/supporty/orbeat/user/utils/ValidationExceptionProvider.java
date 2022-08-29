package supporty.orbeat.user.utils;

import org.springframework.validation.Errors;
import supporty.orbeat.common.BaseResponseStatus;
import supporty.orbeat.common.exception.BaseException;

public class ValidationExceptionProvider {

    public static BaseException throwValidError(Errors errors){
        String errorCode=errors.getFieldError().getCode();
        String errorTarget=errors.getFieldError().getField();
        return new BaseException(ValidationExceptionProvider.getExceptionStatus(errorCode,errorTarget));
    }

    public static BaseResponseStatus getExceptionStatus(String code, String target){
        if(code.equals("NotEmpty")){
            if(target.equals("nickname")) return BaseResponseStatus.EMPTY_NICKNAME;
        }else if(code.equals("Pattern")){
            if(target.equals("nickname")) return BaseResponseStatus.POST_INVALID_NICKNAME;
        }
        return BaseResponseStatus.RESPONSE_ERROR;
    }
}
