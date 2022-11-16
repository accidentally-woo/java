package timeattack;

public class Protractor {
    /*
    0초과 ~ 90 미만 -> 예각  : 0 < angle < 90 -true-> return 1
    90 -> 직각            : angle == 90 -true-> return 2
    90초과 180 미만 -> 둔각  : 90 < angle < 180 -true->return 3
    180 -> 평각           : angle == 180 -true-> return 4

       ** 초과, 이상, 미만, 이하 ** 구분, 비교연산자로 표현할 줄 아셔야 합니다!
     */
    public int calculateAngle(int angle) {
        if (0 < angle && angle < 90) {
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (90 < angle && angle < 180) {
            return 3;
        } else if (angle == 180) {
            return 4;
        }
        return 0; // 180 이상의 값이 들어오면?
    }
}

class Main {

    public static void main(String[] args) {
        Protractor protractor = new Protractor();
        /*
         Tip : 알고리즘 코드 작성 및 테스트 시, 로직에서 값의 경계범위를 항상 신경을 써야한다.
               1. 들어오는 값, 결과물 값의 크기에 따른 범위에 대한 생각 (int형을 사용했을 때, 입력값과 연산의 결과가 int형 범위에 확실하게 사용되는지 확인)
               2. 주어진 문제에서 주어진 값의 경계값에대한 고민(0, 90, 180의 전후 값으로 테스트, 각도는 음수값이 없다는 상식)
         */
        System.out.println(protractor.calculateAngle(70));
        System.out.println(protractor.calculateAngle(91));
        System.out.println(protractor.calculateAngle(180));
        System.out.println(protractor.calculateAngle(181));
        System.out.println(protractor.calculateAngle(0));
    }
}