public enum EnumSingleTon {
    INSTANCE;
    public void whateverMethod() {
    }
}

class Test{
    public static void main(String[] args) throws ClassNotFoundException {
    EnumSingleTon enumSingleTon = EnumSingleTon.INSTANCE;
        Class aClass = enumSingleTon.getClass();
        System.out.println(aClass);


    }
}



