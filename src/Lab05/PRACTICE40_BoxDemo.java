/*
Задание
Изучите и законспектируйте теорию:
1. Классы и объекты (экземпляры классов)
Повторите выполнение данного примера.
Разберитесь в решаемой задаче.
Самостоятельно:
Дополнить класс Box еще одним полем - цвет границы.
Задать цвет для экземпляра myBox.
Создать другой (с именем myBox2) экземпляр класса Box.
Инициализировать его поля.
Вычислить площадь.
Вывести на печать значения всех полей и площади экземпляра myBox2.
Написать javadoc комментарий к классу и методам.
Контрольные вопросы (ответы также включить в отчет)
1. Как создаются экземпляры класса?
2. Как изменить поля экземпляра класса?
*/
package Lab05;
/**
 * Создание объектов
 * на простом примере Box (прямоугольник)
 * Класс очень простой и не содержит методов.
 *
 * @author Gedrevich E.A.
 * @version 1.0 17.10.2023
 */
class Box{
    // поля класса
    double width;
    double height;
}
/**
 * Класс для тестрования класса Box
 *
 * @author Gedrevich E.A.
 * @version 1.0 17.10.2023
 */
public class PRACTICE40_BoxDemo {
    public static void main(String[] args) {
// Создаем экземпляр (с именем) myBox класса Box
        Box myBox = new Box();
        double area;
// присваиваем значение переменным экземпляра
        myBox.height = 25;
        myBox.width = 30;
// вычисляем площадь прямоугольника
        area = myBox.height * myBox.width;
        System.out.println("Площадь прямоугольника = " + area);
    }
}