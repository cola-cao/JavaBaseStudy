public enum  EnumColor {
    RED("红色"),GREEN("绿色"),YELLOW("黄色"),BlUE("蓝色");

    private String msg;

    EnumColor(String msg){
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public static String getValue() {
        for (EnumColor value : EnumColor.values()) {
            System.out.println(value);
            if (true) {
                System.out.println(value.name());
            }
        }

        return null;
    }

    @Override
    public String toString() {
        return "EnumColor{" +
                "msg='" + msg + '\'' +
                '}';
    }
}


class EnumColorTest{

    public static void main(String[] args) {
//        System.out.println(EnumColor.BlUE.toString());
//        System.out.println(EnumColor.getValue());
        System.out.println(EnumColor.BlUE.getClass());
    }
}
