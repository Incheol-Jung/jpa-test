//package chap6.entity;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.List;
//import java.util.Set;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
///**
// * @author Incheol Jung
// */
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//public class Team {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//
////    @OneToMany(mappedBy="team")
//    @OneToMany
////    @JoinColumn(name = "TEAM_ID")
//    private Set<Member> members = new HashSet<>();
//
//    public Team(String name) {
//        this.name = name;
//    }
//
//}
