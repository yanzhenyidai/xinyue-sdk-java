package cn.xinyue365.common;

public class ResponseFactory {

    public static <T extends AbstractResponse<?>> T failure(Class<T> clazz, Exception e) {
        return build(clazz, e.getMessage());
    }

    // 构建通用响应
    private static <T extends AbstractResponse<?>> T build(Class<T> clazz, String msg) {
        try {
            T instance = clazz.getDeclaredConstructor().newInstance();
            instance.setResult(0);
            instance.setMsg(msg);
            instance.setData(null);
            return instance;
        } catch (Exception ex) {
            throw new RuntimeException("构建响应失败: " + clazz.getSimpleName(), ex);
        }
    }
}
