package com.mkproject.issuemanagement.dto;

import com.mkproject.issuemanagement.entity.IssueStatus;
import lombok.Data;

import java.util.Date;

/**
 * @author Melih 22.05.2019
 */

@Data
public class IssueDto {

    private Long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;

}
