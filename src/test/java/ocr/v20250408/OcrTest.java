package ocr.v20250408;

import cn.xinyue365.common.Credential;
import cn.xinyue365.common.profile.HttpProfile;
import cn.xinyue365.ocr.v20250408.OcrClient;
import cn.xinyue365.ocr.v20250408.models.OcrRequest;
import cn.xinyue365.ocr.v20250408.models.OcrResponse;
import com.google.gson.Gson;

/**
 * @author frank
 * @version 1.0
 * @date 2025-04-08 15:06
 */
public class OcrTest {

    public static void main(String[] args) {
        Credential credential = new Credential("aaa", "bbb");
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setConnTimeout(10000);
        OcrClient client = new OcrClient(credential, httpProfile, "https://ocr.xinyue365.cn");

        OcrResponse call = client.call("ocr", new OcrRequest(), OcrResponse.class);
        System.out.println(new Gson().toJson(call));
    }
}
