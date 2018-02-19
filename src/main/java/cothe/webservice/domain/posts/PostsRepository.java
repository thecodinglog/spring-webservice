package cothe.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

/**
 * @author Jeongjin Kim
 * @since 2018. 2. 13.
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p " + "FROM Posts p " + "ORDER BY p.id DESC")
    Stream<Posts> findAllDesc();


}
