package com.mkproject.issuemanagement.entity;

import lombok.*;

import javax.persistence.*;

/**
 * @author Melih 21.05.2019
 */

@Entity
@Table(name = "issue_history")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Data
public class Project extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "project_code", unique = true)
    private String projectCode;

    @Column(name = "project_name", length = 400)
    private String projectName;

    @JoinColumn(name = "manager_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User manager;

}
