package chap7.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("M")
@PrimaryKeyJoinColumn(name = "MOVIE_ID") // 자식 테이블의 기본 키 컬럼명을 변경 (기본 값은 부모 테이블의 ID 컬럼명)
@Getter
@Setter
public class Movie extends Item {
    private String director; //감독
    private String actor; //배우
}
