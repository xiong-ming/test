package 私有方法的定义和使用;

public interface InterfaceprivateB {
    public static void methodStatic1() {
        System.out.println("默认方法1");
        methodStaticCommen();
    }

    public static void methodStatic2() {
        System.out.println("默认方法2");
        methodStaticCommen();
    }

    private static void methodStaticCommen() {
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");

    }

}
