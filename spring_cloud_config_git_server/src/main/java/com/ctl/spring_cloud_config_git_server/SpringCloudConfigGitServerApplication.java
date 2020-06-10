package com.ctl.spring_cloud_config_git_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigGitServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigGitServerApplication.class, args);
    }

}
