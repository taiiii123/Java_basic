import pkgA.Sample02;
import pkgA.Sample02;
import static pkgA.Sample02.print3;
import pkgA.pkgB.Sample03;
import pkgA.pkgB.Sample03;

public class Sample01 {
    
    public static void main(String[] args) {
        // �C���X�^���X�������āA���\�b�h�Ăяo��
        Sample02 s02 = new Sample02();
        Sample03 s03 = new Sample03();
        s02.print1();
        s03.print1();

        // �C���|�[�g�����N���X�̃��\�b�h���Ăяo��
        Sample02.print2();
        Sample03.print2();

        // import static�Ŏw�肵�����\�b�h���Ăяo��
        print3();
    }
}
