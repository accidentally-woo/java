package timeattack;

public class Game369 {
    private final int[] MATCH = {3, 6, 9};

    int countClap(int order) {
        int count = 0;
        while (order > 0) {
            int target = order % 10;
            for (int E : MATCH) {
                if (target == E) {
                    count++;
                    break;
                }
            }
            order /= 10;
        }
        return count;
    }
}

class Main3 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE); // 21억~

        Game369 game369 = new Game369();
        System.out.println(game369.countClap(369));
        System.out.println(game369.countClap(11_139));
        System.out.println(game369.countClap(963_888));
        System.out.println(game369.countClap(999_999));
    }
}