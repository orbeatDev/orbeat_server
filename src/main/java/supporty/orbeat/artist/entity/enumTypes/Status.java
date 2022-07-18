package supporty.orbeat.artist.entity.enumTypes;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {
    //N: 삭제된 아티스트, Y: 삭제되지 않은 아티스트
    N, Y
}
