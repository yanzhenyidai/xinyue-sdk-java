# xinyue-sdk-java
对外提供的SDK接口

---

## 接口清单

1. 文件识别 cn.xinyue365.ocr.v20250408.OcrClient.ocr(cn.xinyue365.ocr.v20250408.models.text.TextRequest)
2. 发票识别 cn.xinyue365.ocr.v20250408.OcrClient.ocr(cn.xinyue365.ocr.v20250408.models.invoice.InvoiceRequest)
3. 发票验真 cn.xinyue365.verify.v20250408.VerifyClient.verify

--- 

## 接口调用

首先需要引入我们的xinyue-sdk-java的依赖

```xml
<dependency>
    <groupId>cn.xinyue365</groupId>'
    <artifactId>xinyue-sdk-java</artifactId>
    <version>latest-version</version>
</dependency>
```

接口调用比较通用，下面是文件识别的代码

```java
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        HttpProfile httpProfile = new HttpProfile();
        OcrClient client = new OcrClient(new Credential("secreId", "secreKey"), httpProfile, "endPoint地址");

        List<String> list = new ArrayList<>();
        list.add("这里填需要提取的内容，例如：名称");
        TextRequest build = TextRequest.builder()
            .file(new File("/tmp/photo.jpg")) // 传入文件时，填写文件路径
            .name("photo.jpg")  // 文件名称
            .extractCharacters(list) // 需要提取的内容，可以多传，例如：名称， 地址，结果会按照提取的内容返回
            .urlInfo("") // 在线文件地址，如果不传文件可以传能访问到的文件下载地址
            .base64Info("") // base64文件
            .build();

        TextResponse textResponse = client.ocr(build);
        System.out.println(System.currentTimeMillis() - start + ":ms");
        System.out.println(new Gson().toJson(textResponse));
    }
```