/* Web�y�[�W���擾���� */
// java.net.URL�N���X���g�p����B

import java.io.InputStream;
import java.net.URL;

public class Sample04 {
    public static void main(String[] args) throws Exception {
        try {
            URL u = new URL("https://www.google.co.jp/");
            InputStream is = u.openStream(); // �C���^�[�l�b�g�ɃA�N�Z�X
            int i = is.read(); // 1�o�C�g�ǂݍ���
            while (i != -1) {
                System.out.print((char) i); // 1�o�C�g��\��
                i = is.read(); // ���̃o�C�g��ǂݍ���
            }
        } catch(Exception e) {
            System.out.println("�A�N�Z�X�o���܂���ł����B");
        }
    }
}
