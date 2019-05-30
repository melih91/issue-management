package com.mkproject.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

/**
 * @author Melih 21.05.2019
 */

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class User extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "username", length = 100, unique = true)
    private String username;

    @Column(name = "password", length = 200)
    private String password;

    @Column(name = "name_surname", length = 200)
    private String nameSurname;

    @Column(name = "email", length = 100)
    private String email;

    @JoinColumn(name = "assignee_user_id")
    @OneToMany(fetch = FetchType.LAZY)
    private List<Issue> issues;


}
