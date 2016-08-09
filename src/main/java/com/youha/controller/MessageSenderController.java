package com.youha.controller;

import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhenchao on 16/8/8.
 */

@RestController
@RequestMapping("/message")
public class MessageSenderController {


    @RequestMapping("/send")
    public void send(@RequestParam String phoneNum) throws Exception{

        String url = "http://gw.api.taobao.com/router/rest";
        String appkey  ="23429489";
        String secret = "4cbeb2cfbf8f8e74af948fd9ec7760ae";
        String smsParms = "{\"number\":\"6666\"}";
        TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
        AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
        req.setExtend("123456");
        req.setSmsType("normal");
        req.setSmsFreeSignName("呦呦在线");
        req.setSmsParamString(smsParms);
        req.setRecNum(phoneNum);
        req.setSmsTemplateCode("SMS_12981051");
        AlibabaAliqinFcSmsNumSendResponse rsp = client.execute(req);
        System.out.println(rsp.getBody());


    }
}
