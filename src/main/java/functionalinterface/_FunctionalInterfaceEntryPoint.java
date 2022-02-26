package functionalinterface;

// 여긴 영상외에 내가 따로 공부한 부분임
public class _FunctionalInterfaceEntryPoint {

    interface _FunctionalInterface{
        void doSomething(String text);
//        void doSomething2(String text);
    }

    public static void main(String[] args) {

        //java lambda 이용해서 초기화

        _FunctionalInterface func = text -> System.out.println(text);
        func.doSomething("do something");

        //java 익명 클래스로 초기화
//        _FunctionalInterface func = new _FunctionalInterface() {
//            @Override
//            public void doSomething(String text) {
//                System.out.println(text);
//            }
//        };
//        func.doSomething("do Something");
    }
}
