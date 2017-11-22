package com.ansible.spring.boot.ansibledemospringboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class CommitInfoController {


    @Value("${git.commit.message.short}")
    private String commitMessage;

    @Value("${git.branch}")
    private String branch;

    @Value("${git.commit.id}")
    private String commitId;

    @Value(("${appVersion}"))
    private String appVersion;

    @Value(("${artifactId}"))
    private String artifactId;

    @RequestMapping("/versions")
    public Map<String, String> getCommitId() {
        Map<String, String> result = new LinkedHashMap<>();
        result.put("Commit message",commitMessage);
        result.put("Commit branch", branch);
        result.put("Commit id", commitId);
        result.put("Artifact id", artifactId);
        result.put("Application version", appVersion);
        return result;
    }

}
