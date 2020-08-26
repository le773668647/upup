package httprequest;

import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

/**
 * @author liangze
 * @create 2020-08-26 下午5:59
 */
public class HttpRequestTest {

    public static String sendPost(String url, String token, String auth) {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic " + auth);
        headers.add("Content-Type","application/json");
        RestTemplate restTemplate = new RestTemplate();
        String param = "";
        HttpEntity<String> httpEntity = new HttpEntity<>(param,headers);
        try {
            ResponseEntity<String> result = restTemplate.postForEntity(url, httpEntity, String.class);
            return result.getBody();
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }

    }

    /**
     * 向指定 URL 发送Get方法的请求
     *
     * @param url
     *            发送请求的 URL
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendGet(String url) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        RestTemplate restTemplate = new RestTemplate();
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        params.add("appId","a");
        params.add("token","b");
        params.add("sign","c");
        HttpEntity requestEntity = new HttpEntity<>(params, headers);
        try {
            ResponseEntity<String> result = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);
            return result.getBody();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }

    }
}
