package cj.cloud.alibaba.nacos.provider.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderBasic9001Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosProviderBasic9001Application.class, args);
    }

}