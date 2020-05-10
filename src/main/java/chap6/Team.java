package chap6;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

/**
 * @author Incheol Jung
 */
@Entity
public class Team {
    @Id @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy="member")
//    @JoinColumn(name = "ID")
    private List<Member> members = new ArrayList<Member>();

    public Team(String name) {
        this.name = name;
    }
}
