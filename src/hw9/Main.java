package hw9;

public class Main {

    public static void main(String[] args) {

        String[][] strings = {
                {"123", "321", "456", "654"},
                {"123", "321", "456", "654"},
                {"123", "321", "456", "654"},
                {"123", "WWW321", "456", "654"}
        };

        try {
            sumArr(strings);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getI() + "x" + e.getJ());
        }
    }

/**
Метод суммирует все элементы массива, размером 4х4
 @throws MyArraySizeException при подачи массива размером не 4х4
 @throws MyArrayDataException при неверных данных в какой либо ячейке
 @param strings строковой массив
 **/
    public static int sumArr(String[][] strings) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (strings.length != 4) {
            throw new MyArraySizeException("Массив должен быть размером 4х4");
        }
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть размером 4х4");
            }
            for (int j = 0; j < strings[i].length; j++) {
                try {
                    sum += Integer.parseInt(strings[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке:", i, j);
                }
            }
        }
        System.out.printf("Сумма всех элементов массива: %d\n", sum);
        return sum;
    }
}



