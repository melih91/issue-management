package com.mkproject.issuemanagement.service;

import com.mkproject.issuemanagement.dto.IssueDto;
import com.mkproject.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

/**
 * @author Melih 22.05.2019
 */

public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issue);
}
