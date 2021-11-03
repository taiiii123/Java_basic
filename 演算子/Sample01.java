// github coplet

class Sample01{
    public static void main(String[] args){

        // 算術演算
        System.out.println("10 + 5 = " + (10 + 5));
        System.out.println("10 - 5 = " + (10 - 5));
        System.out.println("2 * 5 = " + (10 - 5));
        System.out.println("10 / 3 = " + (10 / 3));
        System.out.println("10.0 / 5.0 = " + (10.0f / 3.0f));
        System.out.println("10 % 3 = " + (10 % 3));
        System.out.println("-------------------------");
        
        // 比較演算子
        System.out.println("1 == 2 :" + (1 == 2));
        System.out.println("1 == 1 :" + (1 == 1));
        System.out.println("1 != 1 :" + (1 != 1));

        System.out.println("1 < 2 :" + (1 < 2));
        System.out.println("1 > 2 :" + (1 > 2));
        System.out.println("1 >= 1 :" + (1 >= 1));
        System.out.println("1 <= 1 :" + (1 <= 1));
        System.out.println("-------------------------");
        
        // 単項演算子
        int x = 1;
        System.out.println("x = " + x);
        System.out.println("x++ = " + (x++));
        x = 1;
        System.out.println("++x = " + (++x));
        x = 1;
        System.out.println("--x = " + (x--));
        x = 1;
        System.out.println("x-- = " + (--x));
        System.out.println("-------------------------");

        // 論理演算子
        System.out.println("ture && true => " + (true && true));
        System.out.println("ture && false => " + (true && false));
        System.out.println("ture || true => " + (true || true));
        System.out.println("ture || false => " + (true || false));
        
        // ビット演算子
        System.out.println("1 & 3(AND) => " + (1 & 3));
        System.out.println("1 | 3(OR) => " + (1 | 3));
        System.out.println("1 ^ 3(EOR) => " + (1 ^ 3));
        System.out.println("~2(bit NOT) => " + (~2));
        System.out.println("true == !false(NOT) => " + (true == !false));
        System.out.println("2 << 1 => " + (2 << 1)); // 10 => 100
        System.out.println("-2 >> 1 => " + (-2 >> 1)); // 1111 1111 1111 1111 1111 1111 1111 1110 => 1111 1111 1111 1111 1111 1111 1111 1111
        System.out.println("2 >> 1 => " + (2 >> 1)); // 10 => 1
        System.out.println("-2 >> 1 => " + (-2 >>> 1)); // 1111 1111 1111 1111 1111 1111 1111 1110 => 0111 1111 1111 1111 1111 1111 1111 1111
        System.out.println("-------------------------");

        // 算術代入演算子
        x = 1;
        System.out.println("x = " + x);
        x += 1;
        System.out.println("x += 1 => " + x);
        x = 1;
        x -= 1;
        System.out.println("x -= 1 => " + x);
        x = 2;
        System.out.println("x = " + x);
        x *= 2;
        System.out.println("x *= 2 => " + x);
        x = 1;
        x /= 2;
        System.out.println("x /= 2 => " + x);
        x = 1;
        x %= 2;
        System.out.println("x %= 2 => " + x);
        x = 1;
        x &= 3;
        System.out.println("x &= 3 => " + x);
        x = 1;
        x |= 3;
        System.out.println("x |= 3 => " + x);
        x = 2;
        System.out.println("x = " + x);
        x <<= 1;
        System.out.println("x <<= 1 => " + x);
        x = 2;
        System.out.println("x = " + x);
        x >>= 1;
        System.out.println("x >>= 1 => " + x);
        x = -2;
        System.out.println("x = " + x);
        x >>>= 1;
        System.out.println("x >>= 1 => " + x);
        System.out.println("-------------------------");
        
        
        // 三項演算子
        boolean flag = true;
        String str;
        str = String.format("%s ? ok : bad => ", flag);
        System.out.println(str + (flag ? "ok" : "bad"));
        flag = false;
        str = String.format("%s ? ok : bad => ", flag);
        System.out.println(str + (flag ? "ok" : "bad"));
        
    }
}