import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         --Одномерные массивы--
         1.Создайте метод, который выводит массив в консоль.
         2.Напишите метод, который принимает массив целых чисел и возвращает сумму всех его элементов.
         3.Реализуйте метод для поиска минимального элемента в одномерном массиве
         4.Создайте массив строк, инициализируйте его названиями месяцев года. Выведите все строки, начинающиеся на букву "М"
         5.Напишите метод, который инвертирует порядок элементов в одномерном массиве
         6.Напишите метод, который проверяет, есть ли в массиве повторяющиеся элементы
         7.Напишите метод, который заменяет все отрицательные числа в массиве на их абсолютные значения.
         */
        //1
        int[] numbers1 = {5, 10, 15, 20};
        printArrayLine(numbers1);

        //2
        int[] arrayNumbers = {3, 7, 2, 9};
        int result = sumArray(arrayNumbers);
        System.out.println("Сумма элементов массива: " + result);

        //3
        int[] numbers3 = {8, 3, 6, -2, 10};
        int minValue = findMin(numbers3);
        System.out.println("Минимум: " + minValue);

        //4
        String[] months = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь",
                "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        System.out.println(getMonthsStartingWithM(months));

        //5
        int[] numbers5 = {1, 2, 3, 4, 5};
        reverseArray(numbers5);
        System.out.println(Arrays.toString(numbers5));

        //6
        int[] numbers = {1, 2, 3, 4, 2};
        boolean result6 = hasDuplicates(numbers);
        System.out.println("Есть дубликаты? " + result6);

        //7
        int[] nums = {5, -3, 0, -7, 2};
        replaceNegativesWithAbs(nums);
        System.out.println(Arrays.toString(nums));

        /**
        Многомерные массивы
        1.Создайте двумерный массив 3x3, заполните его единицами на главной диагонали и нулями в остальных ячейках. Выведите массив
        2.Напишите метод, вычисляющий сумму всех элементов в двумерном массиве
        3.Реализуйте поиск максимального элемента в матрице и вывод его координат (строка, столбец)
        4.Реализуйте проверку, является ли двумерный массив квадратным (количество строк = количеству столбцов)
        5.Напишите метод, который находит сумму элементов каждой строки, минимальное и максимальное значение двумерного массива и выводит результаты
        6.Создайте двумерный массив, заполните его так, чтобы элементы на четных позициях были 0, на нечетных — 1.
        */
        //1
        createAndPrintDiagonalMatrix();

        //2
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int total = sum2DArray(matrix);
        System.out.println("Сумма всех элементов: " + total);

        //3
        int[][] matrix3 = {
                {3, 5, 9},
                {1, 8, 4},
                {7, 2, 6}
        };

        findMaxInMatrix(matrix3);

        //4
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] nonSquareMatrix = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        System.out.println(isSquareMatrix(squareMatrix));
        System.out.println(isSquareMatrix(nonSquareMatrix));

        //5
        int[][] matrix5 = {
                {3, 5, 1},
                {8, 2, 7},
                {4, 6, 9}
        };

        analyzeMatrix(matrix5);

        //6
        int[][] matrix6 = createPatternArray(4, 5);
        printMatrix(matrix6);

    }//main(String[] args)

    /**
     * Назначение: Выводит элементы массива в одну строку, разделённые запятыми.
     *
     * @param numbers массив целых чисел для вывода
     */
    public static void printArrayLine(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    /**
     * Назначение: Вычисляет сумму всех элементов массива целых чисел.
     *
     * @param array массив целых чисел
     * @return сумма элементов массива
     */
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    /**
     * Назначение: Находит минимальное значение в массиве целых чисел.
     *
     * @param array массив целых чисел
     * @return минимальный элемент в массиве
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    /**
     * Назначение: Возвращает строку с названиями месяцев, начинающихся на букву "М".
     *
     * @param monthArray массив строк с названиями месяцев
     * @return строка, содержащая месяцы через запятую
     */
    public static String getMonthsStartingWithM(String[] monthArray) {
        StringBuilder result = new StringBuilder();

        for (String month : monthArray) {
            if (month.startsWith("М")) {
                if (result.length() > 0) {
                    result.append(", ");
                }
                result.append(month);
            }
        }
        return result.toString();
    }

    /**
     * Назначение: Инвертирует порядок элементов в переданном массиве целых чисел.
     */
    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int j = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    /**
     * Назначение: Проверяет, содержит ли массив дубликаты.
     *
     * @return true, если есть повторяющиеся элементы, иначе false
     */
    public static boolean hasDuplicates(int[] numbers) {
        Set<Integer> seen = new HashSet<>();
        for (int num : numbers) {
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Назначение: Заменяет все отрицательные элементы массива их абсолютными значениями.
     *
     * @param array массив целых чисел
     */
    public static void replaceNegativesWithAbs(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = Math.abs(array[i]);
            }
        }
    }

    /**
     * Назначение: Создаёт и выводит двумерный массив 3x3 с единицами на главной диагонали и нулями в остальных ячейках.
     */
    public static void createAndPrintDiagonalMatrix() {
        int[][] matrix = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = (i == j) ? 1 : 0;//тернарный оператор
            }
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    /**
     * Назначение: Вычисляет сумму всех элементов в двумерном массиве.
     * @param matrix двумерный массив целых чисел
     * @return сумма всех элементов массива
     */
    public static int sum2DArray(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int value : row) {
                sum += value;
            }
        }
        return sum;
    }

    /**
     * Назначение: Находит максимальный элемент в двумерной матрице и выводит его координаты.
     * @param matrix двумерный массив целых чисел
     */
    public static void findMaxInMatrix(int[][] matrix) {
        int max = matrix[0][0];
        int rowIndex = 0;
        int colIndex = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    rowIndex = i;
                    colIndex = j;
                }
            }
        }

        System.out.printf("Максимальное значение: %d, координаты: строка %d, столбец %d%n", max, rowIndex, colIndex);
    }

    /**
     * Назначение: Проверяет, является ли двумерный массив квадратным (одинаковое количество строк и столбцов).
     * @param matrix двумерный массив целых чисел
     * @return true, если массив квадратный; иначе false
     */
    public static boolean isSquareMatrix(int[][] matrix) {
        int rowCount = matrix.length;

        for (int[] row : matrix) {
            if (row.length != rowCount) {
                return false;
            }
        }

        return true;
    }

    /**
     * Назначение: Для заданного двумерного массива:
     * - выводит сумму элементов каждой строки,
     * - находит минимальное и максимальное значение в массиве.
     * @param matrix двумерный массив целых чисел
     */
    public static void analyzeMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Матрица пуста.");
            return;
        }

        int min = matrix[0][0];
        int max = matrix[0][0];

        System.out.println("Сумма элементов по строкам:");
        for (int i = 0; i < matrix.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                int value = matrix[i][j];
                rowSum += value;

                if (value < min) min = value;
                if (value > max) max = value;
            }
            System.out.printf("Строка %d: %d%n", i, rowSum);
        }

        System.out.println("Минимальное значение в матрице: " + min);
        System.out.println("Максимальное значение в матрице: " + max);
    }

    /**
     * Назначение: Создаёт двумерный массив и заполняет его по правилу:
     * элементы на чётных позициях (i + j чётное) = 0,
     * на нечётных позициях (i + j нечётное) = 1.
     * @param rows количество строк
     * @param cols количество столбцов
     * @return возвращает двумерный массив
     */
    public static int[][] createPatternArray(int rows, int cols) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (i + j) % 2 == 0 ? 0 : 1;
            }
        }
        return matrix;
    }

    /**
     * Назначение: Печатает двумерный массив в консоль.
     * @param matrix двумерный массив целых чисел
     */
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}