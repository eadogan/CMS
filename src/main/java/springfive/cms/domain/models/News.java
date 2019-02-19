package springfive.cms.domain.models;

import lombok.Data;
import java.util.HashSet;
import java.util.Set;

@Data
public class News {

    String id;

    String title;

    String content;

    User author;

    Set<User> mandatoryReviewers = new HashSet<>();

    Set<Review> reviewers = new HashSet<>();

    Set<Tag> tags = new HashSet<>();

    public boolean revised() {
        return this.mandatoryReviewers.stream().allMatch(reviewer -> this.reviewers.stream()
            .anyMatch(review -> reviewer.id.equals(review.userId) && "approved".equals(review.status)));
    }



}
