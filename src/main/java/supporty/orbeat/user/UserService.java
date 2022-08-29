package supporty.orbeat.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import supporty.orbeat.common.BaseResponse;
import supporty.orbeat.common.BaseResponseStatus;
import supporty.orbeat.user.dto.SignUpReq;
import supporty.orbeat.user.entity.User;
import supporty.orbeat.user.repository.UserRepository;

import java.time.LocalDateTime;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public BaseResponse signUp(SignUpReq signUpReq){
        if(checkIfAbleToSignup(signUpReq)) {
            User signUpUser = User.builder().nickname(signUpReq.getNickname())
                                            .createdAt(LocalDateTime.now())
                                            .updatedAt(LocalDateTime.now())
                                            .build();
            try {
                userRepository.save(signUpUser);
            } catch (Exception e) {
                log.error(e.getMessage(), e);
                return new BaseResponse(BaseResponseStatus.INTERNAL_SERVER_ERROR);
            }
        } else {
            return new BaseResponse(BaseResponseStatus.DUPLICATE_NICKNAME);
        }
        return new BaseResponse(BaseResponseStatus.SUCCESS);
    }

    public boolean checkIfAbleToSignup(SignUpReq req) {
        return userRepository.findByNickname(req.getNickname()).isEmpty();
    }
}
