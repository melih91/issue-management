package com.mkproject.issuemanagement.service.impl;

import com.mkproject.issuemanagement.dto.IssueDto;
import com.mkproject.issuemanagement.entity.Issue;
import com.mkproject.issuemanagement.repository.IssueRepository;
import com.mkproject.issuemanagement.service.IssueService;
import com.mkproject.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author Melih 22.05.2019
 */

@Service
public class IssueServiceImpl implements IssueService {

    //constructor injection:
    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    public IssueDto save(IssueDto issue) {

        if (issue.getDate() == null)
            throw new IllegalArgumentException("Issue date cannot be null!");

        Issue issueDb = modelMapper.map(issue, Issue.class);

        issueDb = issueRepository.save(issueDb);

        return modelMapper.map(issueDb, IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        IssueDto[] dtos = modelMapper.map(data.getContent(), IssueDto[].class);
        TPage page = new TPage<IssueDto>();
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}
