class Sample01 {
    public static void main(String[] args) {
        
        // �R�}���h����
        int i = 0;
        for(String s : args) {
            System.out.println("�R�}���h���C������[" + i + "] = " + s);
            i++;
        }

        for(i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
