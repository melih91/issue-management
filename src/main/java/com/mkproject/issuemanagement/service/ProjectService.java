package com.mkproject.issuemanagement.service;

import com.mkproject.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author Melih 22.05.2019
 */

public interface ProjectService {

    Project save(Project project);

    Project getById(Long id);

    List<Project> getByProjectCode(String projectCode);

    List<Project> getByProjectCodeContains(String projectCode);

    Page<Project> getAllPageable(Pageable pageable);

    Boolean delete(Project project);
}
