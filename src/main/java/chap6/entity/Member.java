//package chap6.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
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
//public
//class Member {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//
////    @ManyToOne
////    @JoinColumn(name = "TEAM_ID" , insertable = false, updatable = false)
////    private Team team;
//
//    public Member(String name) {
//        this.name = name;
//    }
//}
