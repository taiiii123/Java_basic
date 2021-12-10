class Sample02{
    public static void main(String[] args){

        // for文
        int i;
        for(i=0; i<10; i++){
            System.out.println(i);
        }
        System.out.println("-----------------");

        // 拡張for文
        int arr[] = {1, 2, 3, 4, 5};
        for(int val: arr){
            System.out.println(val);
        }
        System.out.println("-----------------");

        // while文
        i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------");
        
        // do while
        i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i < 10);
        System.out.println("-----------------");
        
        // break
        for(i=0; i<10; i++){
            if(i == 3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("finesh!");
        System.out.println("-----------------");

        
        // label break(多重ループを一気に抜け出す)
        loop1:
            for(int x=0; x<10; x++){
                for(int y=0; y<10; y++){
                    if((x ==3)&&(y == 5)){
                        break loop1;
                    }
                    System.out.println("y");
                }
            }
        System.out.println("finesh!");
        System.out.println("-----------------");
        
        // continue
        for(i=0; i<10; i++){
            if(i == 5){
                continue;
            }else if(i >= 8){
                continue;
            }
            System.out.println(i);
        }
    }
}