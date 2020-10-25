public class Continue01 {
    public static void main(String[] args) {
        for (int count = 26; count < 40; count++) {
            if (count == 32) {
                continue;
            }
            System.out.println(count);
        }
    }
}