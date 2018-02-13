package cothe.webservice.domain.posts;

import cothe.webservice.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Jeongjin Kim
 * @since 2018. 2. 13.
 */
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 자동 추가
@Getter
@Entity // Table 과 링크될 클래스
public class Posts extends BaseTimeEntity {
    @Id // pk 필드
    @GeneratedValue // pk 생성 규칙
    private  Long id;

    @Column(length=500, nullable = false) // 없어도 필드는 모두 컬럼이 되지만 특별이 필요한 옵션이 있을 때 사용
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder //빌더 패턴 클래스 생성
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

}
