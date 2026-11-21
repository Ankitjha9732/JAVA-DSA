package DAY1;
public class hello {
    public static void main(String[] args){
        int num = 400;
        System.out.println(num);

        char firstCharacter = 'a';
        System.out.println("my first character is :" + firstCharacter);
        System.out.println("my first character is :" + (firstCharacter + 2));  //ASCII VALUE
        System.out.println("my first character is :" + (char) (firstCharacter + 2));


        //implicit type casting
        byte num1 = 127;
        
        long newNum = num1;
        System.out.println("my new number is :" + newNum);


        //explicit type casting
        long val1 = 1234567899;
        
        int val2 = (int) val1;
        System.out.println("my new number is :" + val2);

        int b = 10;
        System.out.println(b++);
        System.out.println(b);
        System.out.println(++b);
        System.out.println(--b);
        System.out.println(b--);
        System.out.println(b);
    }
}
