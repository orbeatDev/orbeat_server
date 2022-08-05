package supporty.orbeat.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class SignUpRes {
    private Long userId;
    private String userName;
    private LocalDateTime createdAt;
}
