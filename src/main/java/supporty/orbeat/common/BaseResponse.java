package supporty.orbeat.common;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

import static supporty.orbeat.common.BaseResponseStatus.SUCCESS;

@Getter
@AllArgsConstructor
@JsonPropertyOrder({"isSuccess", "code", "message", "result"})
public class BaseResponse<T>{
    @JsonProperty("isSuccess")
    private final Boolean isSuccess;
    private final String message;
    private final int code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T result;
    private List<T> results;

    //요청에 성공한 경우
    public BaseResponse(T result){
        this.isSuccess=SUCCESS.isSuccess();
        this.message=SUCCESS.getMessage();
        this.code=SUCCESS.getCode();
        this.result=result;
    }

    //리스트 요청에 성공한 경우
    public BaseResponse(List<T> results){
        this.isSuccess=SUCCESS.isSuccess();
        this.message=SUCCESS.getMessage();
        this.code=SUCCESS.getCode();
        this.results=results;
    }

    //요청에 실패한 경우
    public BaseResponse(BaseResponseStatus status) {
        this.isSuccess = status.isSuccess();
        this.message = status.getMessage();
        this.code = status.getCode();
    }
}