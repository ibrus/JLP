public class Task3 {
//    3) Определите сложность следующего алгоритма
//    (задание будет подробно рассмотренно в классе - но предварительно
//    попробуйте погуглить и разобраться в теме):

    public static void main(String[] args) {
        int k = 0;
        int n = 10;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int z = j + 1; z < n; z++) {
                  k++;
                }
            }
        }
        System.out.println("The result is " + k);
    }

    // Сложность такого алгоритма O(n^3), несмотря на то, что вложенные циклы уменьшаются.
    // Время выполнения такого такого алгоритма составит O(n * 1/2 * (n-1) * 1/3*(n-2)),
    // Но так как константы в О-большом игнорируюся остается O(n * n * n)
}
