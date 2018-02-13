package cothe.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Jeongjin Kim
 * @since 2018. 2. 13.
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
