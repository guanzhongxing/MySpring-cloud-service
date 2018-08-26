package cn.itmuch.cloud;

import cn.itmuch.cloud.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2018/8/26 0026.
 */
@FeignClient("microservice-provider-user")
public interface UserFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/simple/{id}")
    public User findById(@PathVariable("id") Long id);
}
