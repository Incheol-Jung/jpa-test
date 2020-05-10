package chap6;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Incheol Jung
 */
@Entity
@Getter
@Setter
class Member {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
//    @JoinColumn
    private Team team;

    public Member(String name) {
        this.name = name;
    }
}
