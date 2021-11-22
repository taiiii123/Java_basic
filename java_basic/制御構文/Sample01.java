class Sample01{
    public static void main(String[] args){
        // if分
        int x1 = 1;
        if(x1 == 1){
            System.out.println("x1 is 1");
        }
        
        // else文
        int x2 = 2;
        if(x2 == 1){
            System.out.println("x2 is 1");
        }else{
            System.out.println("x2 is not 1");
        }
        
        // else if文
        int x3 = 3;
        if(x3 == 1){
            System.out.println("x3 is 1");
        }else if(x3 == 3){
            System.out.println("x3 is 3");
        }else{
            System.out.println("unknown");
        }
        
        // switch文
        int n = 3;
        switch(n){
            case 1:
                System.out.println("n is 1");
                break;
            case 2:
                System.out.println("n is 2");
                break;
            case 3:
                System.out.println("n is 3");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}