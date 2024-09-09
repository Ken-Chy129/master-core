package cn.ken.master.core.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ken-Chy129
 * @date 2024/8/11
 */
public class Request {

    /**
     * 请求名称
     */
    private int requestCode;

    /**
     * 变量列表
     */
    private Map<String, String> parameterMap;

    public Request() {
        parameterMap = new HashMap<>();
    }

    public int getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(int requestCode) {
        this.requestCode = requestCode;
    }

    public Map<String, String> getParameterMap() {
        return parameterMap;
    }

    public void setParameterMap(Map<String, String> parameterMap) {
        this.parameterMap = parameterMap;
    }

    public void addParameter(String key, String value) {
        parameterMap.put(key, value);
    }
}
