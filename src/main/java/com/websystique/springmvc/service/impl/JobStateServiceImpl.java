package com.websystique.springmvc.service.impl;


import com.websystique.springmvc.dao.IJobStateDao;
import com.websystique.springmvc.persistence.entities.JobState;
import com.websystique.springmvc.service.IJobStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobStateServiceImpl implements IJobStateService {

    @Autowired
    private IJobStateDao jobStateDao;

    @Override
    public JobState getJobStateById(Long jobId) {
        return jobStateDao.getJobStateById(jobId);
    }

    @Override
    public void updateJobSate(JobState jobState) {
        jobStateDao.updateJobSate(jobState);
    }
}
