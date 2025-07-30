package com.portal.appliedJobs.entity;

import com.portal.appliedJobs.Status;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "applied_jobs")
@CompoundIndex(name = "unique_application", def = "{'applicantEmail' : 1, 'jobId': 1}", unique = true)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppliedJobs {
    @Id
    private String id;

    private String applicantEmail;
    private String resumeUrl;
    private String portfolioUrl;
    private String expectedSalary;
    private String noticePeriod;
    private String currentLocation;
    private String experienceLevel;

    private String panCard;
    private String githubUrl;
    private String linkedInUrl;

    private String jobId;
    private LocalDateTime appliedOn;

    private Status status;
    private LocalDateTime banExpiryDate;
}
