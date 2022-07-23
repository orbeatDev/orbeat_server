package supporty.orbeat.common.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import supporty.orbeat.common.BaseResponseStatus;

@Getter
@Setter
@AllArgsConstructor
public class BaseException extends Exception{
    private BaseResponseStatus status;
}
