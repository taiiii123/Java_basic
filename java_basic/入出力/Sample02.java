/* �t�@�C�����o��2 - �ǂݍ��� */
/* 
java.io.BufferedReader���g�p
BufferedReader�N���X��readLine���\�b�h�œǂݍ���
1�s�����ǂݍ���
*/
import java.io.*;

public class Sample02 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
            br.close();
        }catch(Exception e) {
            System.out.println("�t�@�C����������܂���");
        }
    }
}
