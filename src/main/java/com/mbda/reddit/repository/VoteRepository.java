package com.mbda.reddit.repository;

import com.mbda.reddit.model.Post;
import com.mbda.reddit.model.User;
import com.mbda.reddit.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User user);
}
