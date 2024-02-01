package static2;

//import static static2.DecoData.staticCall;
//import static static2.DecoData.*; //이건 클래스. 으로 접근 안하고 함수 이름만으로 접근하고 싶을 때 쓰면 된다.

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1.정적 호출");
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2.인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3.인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        //추가
        //인스턴스를 통한 접근. 권장 안함
        DecoData data3 = new DecoData();
        data3.staticCall();

        //클래스를 통한 접근. 권장
        DecoData.staticCall();
    }
}
