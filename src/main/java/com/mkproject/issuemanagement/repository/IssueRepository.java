package com.mkproject.issuemanagement.repository;

import com.mkproject.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Melih 21.05.2019
 */
public interface IssueRepository extends JpaRepository<Issue, Long> {


}
