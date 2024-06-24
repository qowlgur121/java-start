package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-boxing)
        // -> Integer boxedValue = Integer.valueOf(value); 이거를 컴파일 단계에서 알아서 추가해줌

        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱(Auto-Unboxing)
        // -> int unboxedValue = boxedValue.intValue(); 이거를 컴파일 단계에서 알아서 추가해줌

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
        
    }
}
