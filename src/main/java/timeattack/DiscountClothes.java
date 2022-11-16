package timeattack;

public class DiscountClothes {
    /*
    100_000 이상 구매시, 5% 할인
    300_000 이상 구매시 10% 할인
    500_000 이상 구매시 20% 할인
     */
    public int calculateDiscountedPrice(int price) {
        if (price >= 500_000) {
            return (int) (price * 0.8);
             // 소수점 자리의 값은 어떻게 되는 걸까?
        } else if (price >= 300_000) {
            return (int) (price * 0.9);
        } else if (price >= 100_000) {
            return (int) (price * 0.95);
        }

        return price;
    }
}

class Main2 {
    public static void main(String[] args) {
        DiscountClothes discountClothes = new DiscountClothes();

        System.out.println(discountClothes.calculateDiscountedPrice(100_000));
        System.out.println(discountClothes.calculateDiscountedPrice(100_100));
        System.out.println(discountClothes.calculateDiscountedPrice(150_000));
        System.out.println(discountClothes.calculateDiscountedPrice(300_000));
        System.out.println(discountClothes.calculateDiscountedPrice(300_100));
        System.out.println(discountClothes.calculateDiscountedPrice(500_000));
        System.out.println(discountClothes.calculateDiscountedPrice(510_000));
        System.out.println(discountClothes.calculateDiscountedPrice(510_100));
        // 입력값이 특이한 경우
        System.out.println(discountClothes.calculateDiscountedPrice(510_053));
        // 408042.4의 결과 값이 나오면서, 소수점 자리가 날라감. 어떻게 날라가지?
        System.out.println(discountClothes.calculateDiscountedPrice(510_056));
        // 408044.8 소수점이 날라간다.
    }
}