import java.util.Scanner;

class Sample01{
    public static void main(String[] args){
        // �W������
        Scanner scanner = new Scanner(System.in);

        // ����(������)
        System.out.print("���������͂��Ă��������F");
        String str = scanner.nextLine();
        
        // �W���o��
        System.out.println("���͂��ꂽ�������" + str + "�ł��B");

        // ����(���l)
        System.out.print("���l����͂��Ă��������F");
        int num = scanner.nextInt();

        // �W���o��
        System.out.println("���͂��ꂽ���l��" + num + "�ł��B");

        // ����(����)
        System.out.print("�����̒l����͂��Ă��������F");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // �W���o��
        System.out.println("���͂��ꂽ���l��" + num1 + "��" + num2 + "�ł��B");
        scanner.close();
    }
}