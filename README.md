# xinyue-sdk-java
对外提供的SDK接口，当前latest-version为 **1.0.8**，endPoint地址为 **http://82.157.150.37:16081**

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

---

## 接口清单

> 1. 文件识别 cn.xinyue365.ocr.v20250408.OcrClient.ocr(cn.xinyue365.ocr.v20250408.models.text.TextRequest)

文件识别示例代码
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

> 2. 发票识别 cn.xinyue365.ocr.v20250408.OcrClient.ocr(cn.xinyue365.ocr.v20250408.models.invoice.InvoiceRequest)

发票识别示例代码
```java

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        HttpProfile httpProfile = new HttpProfile();
        OcrClient client = new OcrClient(new Credential("secreId", "secreKey"), httpProfile, "endPoint地址");

        InvoiceRequest build = InvoiceRequest.builder()
            .file(new File("C:\\Users\\TanZhen\\Desktop\\GX-FPC-25-0255_0003.jpg")) // 填写文件路径
            .name("GX-FPC-25-0255_0003.jpg")  // 文件名称
            .build();
        InvoiceResponse ocr = client.ocr(build);

        System.out.println(new Gson().toJson(ocr));
    }
}
```

3. 发票验真(旧) cn.xinyue365.verify.v20250408.VerifyClient.verify

发票验真示例代码
```java
    public static void main(String[] args) {
        HttpProfile httpProfile = new HttpProfile();
        VerifyClient client = new VerifyClient(new Credential("secreId", "secreKey"), httpProfile, "endPoint地址");

        VerifyRequest build = VerifyRequest.builder()
            .invoiceCode("")  // 发票代码
            .invoiceNum("")  // 发票号码
            .invoiceDate("2025-05-23") // 发票日期 yyyy-MM-dd
            .amountTotal("47.17")  // 税前金额
            .tax("2.83") // 税额
            .taxAmount("50") // 价税合计
            .build();
        VerifyResponse ocr = client.verify(build);
        System.out.println(new Gson().toJson(ocr));
    }
```

4. 发票验真(新) cn.xinyue365.verify.v20260105.VerifyClient.verify ***推荐使用***

发票验真示例代码
```java
    public static void main(String[] args) {
        HttpProfile httpProfile = new HttpProfile();
        VerifyClient client = new VerifyClient(new Credential("secreId", "secreKey"), httpProfile, "endPoint地址");

        VerifyRequest build = VerifyRequest.builder()
            .fpdm("") // 发票代码
            .fphm("")   // 发票号码
            .kprq("2025-02-12") // 发票日期 yyyy-MM-dd
            .je("48055.32")  // 价税合计
            .jym("") // 校验码
            .build();
        VerifyResponse ocr = client.verify(build);
        System.out.println(new Gson().toJson(ocr));
    }
```