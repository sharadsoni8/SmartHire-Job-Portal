package com.portal.user.repository;

import com.portal.user.Entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
    User findByEmail(String email);
    boolean existsByGitHubUrl(String gitHubUrl);
    boolean existsByLinkedInUrl(String linkedInUrl);
    boolean existsByPanCard(String panCard);

}
