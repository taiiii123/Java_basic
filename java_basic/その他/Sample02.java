/* �������Ԃ��v������ */

public class Sample02 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // ���Ԍv��������������
        int result = 0;
        for (int i = 0; i < 1000000; i++) {
            result += 1;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("�������ԁF" + (endTime - startTime) + "�~���b");
    }
}
