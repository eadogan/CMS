package springfive.cms.domain.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review {

    String userId;

    String status;

    public Review(String userId, String status) {
        this.userId = userId;
        this.status = status;
    }
}
