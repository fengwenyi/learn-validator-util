package com.fengwenyi.learn_validator_util.controller;

import com.fengwenyi.learn_validator_util.common.BeanValidator;
import com.fengwenyi.learn_validator_util.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.MapUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author Erwin Feng
 * @since 2019-06-11 01:16
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class TestController {

    @GetMapping("/user")
    public String user(User user) {
        log.info(">>>>>>>>>>>>validate>>>>>>>>>>>>>>");
        /*try {
            Map<String, String> map = BeanValidator.validateObject(user);
            if (MapUtils.isNotEmpty(map)) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    log.info("{}->{}", entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e) {

        }*/

        BeanValidator.check(user);
        // 'username'不能为空, 'id'不能为null, 'age'不能为null, 'schools'不能为空

        return user.toString();
    }

}
