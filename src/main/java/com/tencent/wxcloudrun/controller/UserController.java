package com.tencent.wxcloudrun.controller;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.tencent.wxcloudrun.config.ApiResponse;
import com.tencent.wxcloudrun.dto.CounterRequest;
import com.tencent.wxcloudrun.model.Counter;
import com.tencent.wxcloudrun.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.List;

/**
 * user控制器
 */
@RestController

public class UserController {

    final Logger logger;

    public UserController(@Autowired CounterService counterService) {
        this.logger = LoggerFactory.getLogger(CounterController.class);
    }


    /**
     * 获取当前计数
     * @return API response json
     */
    @GetMapping(value = "/user/message")
    ApiResponse get() {
        logger.info("/api/count get request");

        return ApiResponse.ok(123);
    }

    /**
     * 验证消息来自微信
     * @param request
     * @param response
     * @return
     */
    @GetMapping("/user/message")
    public String replyWxServe(ServletRequest request, ServletResponse response)  {
        // 获取数据
//        String signature = request.getParameter("signature");
//        String timestamp = request.getParameter("timestamp");
//        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
//        List<String> list = new ArrayList<>();
//        // 配置上所填写的token
//        list.add("chy123");
//        list.add(timestamp);
//        list.add(nonce);
//        // 字典序排序
//        Collections.sort(list);
//        // 拼接
//        StringBuilder sb = new StringBuilder();
//        list.forEach(sb::append);
//        // sha1加密
//        String hashCode = DigestUtils.sha1DigestAsHex(sb.toString());
//        logger.info("hashCode:"+hashCode);
//        logger.info("signature:"+signature);
//        // 比对
//        if (StringUtils.equals(hashCode,signature)){
            return echostr;
//        }else {
//            return "";
//        }
    }
}
