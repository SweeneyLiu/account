package com.tencent.account.controller;

import com.tencent.account.entity.Auth;
import com.tencent.account.entity.Auth.DataBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AuthController {

    @RequestMapping("/auth")
    public Auth requestAuth(@RequestParam(value="appkey") String appkey) {
        //从数据库读取数据
        return getAuthData();
    }

    private Auth getAuthData(){
        Auth authBean = new Auth();
        authBean.setMsg("接口调用成功");
        authBean.setCode(100);
        DataBean dataBean = new Auth.DataBean();
        dataBean.setAuthType(1);
        dataBean.setStatus(1);
        dataBean.setSignKey("lsw123456789");

        List<String> referrerList = new ArrayList<>();
        referrerList.add("www.qq.com");
        referrerList.add("www.baidu.com");
        referrerList.add("www.soso.com");
        dataBean.setReferrerList(referrerList);
        List<String> ipList = new ArrayList<>();
        ipList.add("119.75.217.109");
        ipList.add("220.181.112.244");
        ipList.add("115.239.210.27");
        dataBean.setIpList(ipList);
        authBean.setData(dataBean);
        return authBean;
    }

}
