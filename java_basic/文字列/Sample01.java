class Sample {
    public static void main(String[] args) {
        /* ������𒲍� */
        String s1 = "Java";
        String s2 = "java";
        String s3 = "Sample";

        // ������1.equals(������2) -> ���e�������������ׂ�
        if(s1.equals(s2)) {
            System.out.println(s1 + "��" + s2 + "�̓��e�͓�����");
        }else{
            System.out.println(s1 + "��" + s2 + "�̓��e�͓������Ȃ�");
        }

        // ������1.equalsIgnoreCase(������2) ->�@�啶���A����������ʂ����ɓ��������𒲂ׂ�
        if(s1.equalsIgnoreCase(s2)) {
            System.out.println(s1 + "��" + s2 + "�͓�����");
        }else{
            System.out.println(s1 + "��" + s2 + "�͓������Ȃ�");
        }

        // ������1.length() -> �����񒷂𒲂ׂ�
        System.out.println(s1 + "�̒�����" + s1.length() + "�ł�");

        // ������1.isEmpty() -> �󕶎�(������0��)�𒲂ׂ�
        if(s1.isEmpty()){
            System.out.println(s1 + "�͋󕶎��ł�");
        }else{
            System.out.println(s1 + "�͋󕶎��ł͂���܂���");
        }
    }
}