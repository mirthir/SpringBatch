package com.springbatch.config;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;

public class JobCompletionListener extends JobExecutionListenerSupport {

    @Override
    public void afterJob(JobExecution execution){
        if(execution.getStatus() == BatchStatus.COMPLETED){
            System.out.println("Job Finalizado com Sucesso!");
        }
    }
}
