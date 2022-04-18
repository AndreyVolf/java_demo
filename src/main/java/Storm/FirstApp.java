package Storm;

public class FirstApp {


    public static void main(String[] args) {
        char symbol, anotherSymbol;
        symbol = 'w';
        boolean flag = false;
        byte aByte = 123;  // 1231; -128 ...127
        short aShort;       // -32768 ...32767
        int aInt = aByte; //2
        Integer boxer = null;

        char[][] array = new char[][]{{'w', 'a', 's'}};

        long aLong = 123L;
        aLong = aLong = + 1;
        float aFloat = 1.2F;
        double aDouble = 1.2D;

        String aString = "Andrey";
        String aString0 = "Andrey";

         // + сложение
        // - вычитание
        // * умножение
        // / деление (цулочисленное!)
        //  % взятие остатка от деления


        // логические операторы
        // & И (&&)
        // | Или (||)
        // ! Отрицание
        // != не равно
        // == равно
       // instanceof
       // > больше
        // >= больше или равно
        // < меньше
        // <= меньше или равно



       if  (aString.equals("Andrey")) {
           if (aString.length()== 5) {
               System.out.println("Hi, " + aString);
           }
       } else if (aString.equals("Alex")) {
           System.out.println("Hi, " + aString);
       } else {
           System.out.println("Dosada");
       }

       switch (aString) {
           case "Andrey":
            System.out.println("Hi, " + aString);
            break;
           case "Alex":
               System.out.println("Hi, " + aString);
               break;

    }

         aString = 3 > 2
                 ? "Andrey"
                 : "Alex";

       if (3 > 2) {
           aString = "Andrey";
       }else {
           aString = "Alex";
       }




        getMaxIntNumber();
System.out.println(summ(aByte, (int) aLong));
    }

    static int getMaxIntNumber() {
        System.out.println("max value: " + Integer.MAX_VALUE);
        return 0;
    }

static int summ(int first,int second){
        return first + second;
    }
}



