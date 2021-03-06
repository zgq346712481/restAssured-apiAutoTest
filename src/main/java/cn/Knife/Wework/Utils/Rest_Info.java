package cn.Knife.Wework.Utils;

import java.util.HashMap;
import java.util.Objects;

/**
 * @author Knife
 * @description
 * @createTime 2020-05-08 14:19
 */
public class Rest_Info extends Super_Utils {

    //为什么把url和uri拆分维护？？？？
    //如果后期涉及到比较强的上游接口依赖难道每次我们都先调用其他接口吗？？
    //不！拿到uri判断过后就能对它搔首弄姿，肆意玩弄它
    public String url = "https://qyapi.weixin.qq.com/";
    public String uri;
    public String method;
    public HashMap<String, Object> header;
    public HashMap<String, Object> query = new HashMap<>();
    public String body;

    private static Rest_Info rest_info;

    /**
     * 返回rest_info对象
     *
     * @return
     */
    public static Rest_Info getInstance() {
        if (Objects.isNull(rest_info)) {
            rest_info = new Rest_Info();
        }
        return rest_info;
    }
}
