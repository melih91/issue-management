package com.mkproject.issuemanagement.service;

import com.mkproject.issuemanagement.entity.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Melih 22.05.2019
 */

public interface IssueHistoryService {

    IssueHistory save(IssueHistory issue);

    IssueHistory getById(Long id);

    Page<IssueHistory> getAllPageable(Pageable pageable);

    Boolean delete(IssueHistory issueHistory);
}
