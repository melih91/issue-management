package com.mkproject.issuemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Melih 22.05.2019
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {

    private Long id;
    private String projectName;
    private String projectCode;
}
