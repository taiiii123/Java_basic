/* �t�@�C�����o��1 - �ǂݍ���1 */
/* 
java.io.FileReader���g�p
FileReader�N���X��read���\�b�h�œǂݍ���
1�������ǂݍ���
*/
import java.io.*;


public class Sample01 {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("data.txt"); // �t�@�C����ǂݍ���
            int input = fr.read();

            // �t�@�C����ǂݍ��񂾂�A�t�@�C�������
            while (input != -1) { // -1��EOF
                System.out.print((char)input);
                input = fr.read();
            }
            fr.close();
        } catch(Exception e) {
            System.out.println("�t�@�C����������܂���");
        } 
    }
}