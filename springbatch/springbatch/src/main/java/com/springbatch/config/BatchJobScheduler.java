package com.springbatch.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configuration
@EnableBatchProcessing
@EnableScheduling
public class BatchJobScheduler {

    @Autowired
    private Job processJob;

    @Autowired
    private JobLauncher jobLauncher;

    @Scheduled(cron = "0 * * * * *")
    public void runBatchJob(){
        JobParameters params = new JobParametersBuilder()
                .addLong("time", System.currentTimeMillis())
                .toJobParameters();

        try{
            jobLauncher.run(processJob, params);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
