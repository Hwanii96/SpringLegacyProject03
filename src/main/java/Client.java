public class Client {
    public static void main(String[] args) {

        BeanFactory beanFactory = new BeanFactory();

        //  Phone 인터페이스 타입으로 다운 캐스팅.
        Phone phone = (Phone) beanFactory.getBean("갤럭시폰");
//          Phone phone = (Phone) beanFactory.getBean("아이폰");

        phone.powerOn();
        phone.volumeUp();
        phone.volumeDown();
        phone.powerOff();

        //  위와 같이 객체의 이름 (키워드) 으로, 객체 자체를 반환 받을 수 있다.
        //  갤럭시폰 또는 아이폰을 사용 하기 위해서 new 키워드를 전혀 사용 하지 않았다.

        //  자바에서 new 키워드를 직접 작성 하지 않는 방법이 또 존재 한다.
        //  => .xml 설정 파일.

    }   //  main()

}   //  mainClass
