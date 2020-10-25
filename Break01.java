public class Break01 {
    public static void main(String[] args) {
        for (int count = 0; count < 26; count++) {
            if (count == 10) {
              break;
            }
            System.out.println(count);
        }
    }
}
