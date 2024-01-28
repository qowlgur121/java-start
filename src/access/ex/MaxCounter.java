package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count == max) {
            System.out.println("최대값입니다.");
            return; //검증 로직 부분일 때 return으로 두면 복잡할 때 좋음
        }
        count++;    //실행 로직
    }

    public int getCount() {
        return count;
    }

}
