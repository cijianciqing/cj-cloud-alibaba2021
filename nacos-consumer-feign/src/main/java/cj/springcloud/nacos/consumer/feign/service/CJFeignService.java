package cj.springcloud.nacos.consumer.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther zzyy
 * @create 2020-02-19 23:59
 */
@Component
@FeignClient(value = "cj-cloud-alibaba2021-provider-basic")
public interface CJFeignService {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable(value = "string") String string);

}
