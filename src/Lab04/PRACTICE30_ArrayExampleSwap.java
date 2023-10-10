/*
Задание
Изучите и законспектируйте теорию:
1. Передача данных с помощью массивов в метод
Повторите выполнение данного примера.
Разберитесь в решаемой задаче.
Самостоятельно:
Решить квадратное уравнение вида a*x*x+b*x-c=0
Решение оформить в виде класса.
Параметры уравнения a, b, c вводить с консоли.
Для решения создать метод.
Для корней использовать массив.
Корни вывести на консоль.
Написать javadoc комментарий к методу, классу
Контрольные вопросы (ответы также включить в отчет)
1. Какие варианты существуют для объявления массивов? Инициализации?
Приведите примеры.
2. Как осуществляется передача данных с использованием массивов?
2. В чем отличие передачи данных по ссылке и по значению?
*/
package Lab04;
/**
 * два примера использования массивов для
 * передачи данных в метод и обратно
 * пример 1: обмен местами элементов массива
 * пример 2; решение квадратного уравнения
 *
 * @author Gedrevich E.A.
 * @version 1.0 10.10.2023
 */
public class PRACTICE30_ArrayExampleSwap {
    public static void main(String[] args) {
// пример 1: обмен местами элементов массива
// объявляем и конструируем массив var
        int[] var = new int[4];
// инициализируем массив var
        var[0] = 3;
        var[1] = -7;
        var[2] = 9;
        var[3] = 18;
        System.out.println("Элементы массива до обмена:" +
                "\n\t var[1] = " + var[1] +
                "\n\t var[2] = " + var[2]);
        swap(var, 1, 2);
        System.out.println("Элементы массива после обмена:" +
                "\n\t var[1] = " + var[1] +
                "\n\t var[2] = " + var[2]);
        double[] var2 = func(var);
        System.out.println("Элементы массива корней" +
                "\n\tx1 = " + var2[0] +
                "\n\tx2 = " + var2[1]);
    }
    // меняет местами элементы массива arr[i] и arr[j]
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // пример 2: нахождение корней квадратного уравнения
    private static double[] func(int[] arr){
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        double dsc = Math.pow(b, 2) - 4 * a * c;
        double x1 = -b + Math.sqrt(dsc);
        double x2 = -b - Math.sqrt(dsc);
        return new double[]{x1, x2};
    }
}