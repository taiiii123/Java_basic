public class Sample02 {
    public static void main(String[] args) {
        /* ����������� */
        String s = "Java and JavaScript";

        // �����Ώۂ̕�����.contains(������s) -> �ꕔ�ɕ�����s���܂܂�邩�ǂ����𔻒肷��
        if(s.contains("and")) {
            System.out.println("and���܂�");
        }else{
            System.out.println("and���܂܂Ȃ�");
        }

        // �����Ώۂ̕�����.startsWith(������s) -> ������s�Ŏn�܂邩�ǂ����𔻒肷��
        if(s.startsWith("Java")) {
            System.out.println("Java�Ŏn�܂�");
        }else{
            System.out.println("Java�Ŏn�܂�Ȃ�");
        }

        // �����Ώۂ̕�����.endsWith(������s) -> ������s�ŏI��邩�ǂ����𔻒肷��
        if(s.endsWith("Script")) {
            System.out.println("Script�ŏI���");
        }else{
            System.out.println("Script�ŏI���Ȃ�");
        }

        // �����Ώۂ̕�����.indexOf(������s) -> ������s���ŏ��Ɍ����ʒu��Ԃ�
        int index = s.indexOf("Java");
        System.out.println("Java�̈ʒu��" + index);

        // �����Ώۂ̕�����.lastIndexOf(������s) -> ������s���Ōォ�猟�����Č����ʒu��Ԃ�
        index = s.lastIndexOf("Java");
        System.out.println("Java�̈ʒu��" + index);

    }
}