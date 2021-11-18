class Sample04 {
    /* 可変引数 */
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
    }
    
    private static int sum(int... nums) // 可変長引数
    { 
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return sum;
    }
}