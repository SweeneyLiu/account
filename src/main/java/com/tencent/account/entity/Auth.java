package com.tencent.account.entity;

import java.util.List;

public class Auth {
    /**
     * msg : 接口调用成功
     * code : 100
     * data : {"authType":1,"signKey":"lsw123456789","status":1,"referrerList":["www.qq.com","www.baidu.com","www.soso.com"],"ipList":["119.75.217.109","220.181.112.244","115.239.210.27"]}
     */

    private String msg;
    private int code;
    private DataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * authType : 1
         * signKey : lsw123456789
         * status : 1
         * referrerList : ["www.qq.com","www.baidu.com","www.soso.com"]
         * ipList : ["119.75.217.109","220.181.112.244","115.239.210.27"]
         */

        private int authType;
        private String signKey;
        private int status;
        private List<String> referrerList;
        private List<String> ipList;

        public int getAuthType() {
            return authType;
        }

        public void setAuthType(int authType) {
            this.authType = authType;
        }

        public String getSignKey() {
            return signKey;
        }

        public void setSignKey(String signKey) {
            this.signKey = signKey;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public List<String> getReferrerList() {
            return referrerList;
        }

        public void setReferrerList(List<String> referrerList) {
            this.referrerList = referrerList;
        }

        public List<String> getIpList() {
            return ipList;
        }

        public void setIpList(List<String> ipList) {
            this.ipList = ipList;
        }
    }
}
