package Krasko.Lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Case1. Дано целое число в диапазоне 1–7. Вывести строку — название дня
        //недели, соответствующее данному числу (1 — «понедельник», 2 — «втор-
        //18 М. Э. Абрамян. Электронный задачник Programming Taskbook 4.5
        //ник» и т. д.).
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое число ");
        int day = in.nextInt();
        if (day == 1) {
            System.out.println("понедельник");
        } else if (day == 2) {
            System.out.println("вторник");
        } else if (day == 3) {
            System.out.println("среда");
        } else if (day == 4) {
            System.out.println("четверг");
        } else if (day == 5) {
            System.out.println("пятница");
        } else if (day == 6) {
            System.out.println("суббота");
        } else if (day == 7) {
            System.out.println("суббота");
        } else {
            System.out.println("Нет дня с таким номером");
        }*/

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое число ");
        int day = in.nextInt();
        switch (day){
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("Нет дня с таким номером");*/

        //Case2. Дано целое число K. Вывести строку-описание оценки,
        // соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).
        // Если K не лежит в диапазоне 1–5,
        //то вывести строку «ошибка».

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое число ");
        int day = in.nextInt();
        switch (day){
            case 1:
                System.out.println("понедельник");
                break;
            case 2:
                System.out.println("вторник");
                break;
            case 3:
                System.out.println("среда");
                break;
            case 4:
                System.out.println("четверг");
                break;
            case 5:
                System.out.println("пятница");
                break;
            case 6:
                System.out.println("суббота");
                break;
            case 7:
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("ошибка");*/

        //Case3. Дан номер месяца — целое число в диапазоне 1–12
        // (1 — январь, 2 — февраль и т. д.). Вывести название соответствующего времени года («зима»,
        //«весна», «лето», «осень»)

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите положительное целое число ");
        int day = in.nextInt();
        switch (day){
            case 1:
            case 2:
            case 12:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("ошибка");*/

        //Case4◦
        //. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —
        //февраль и т. д.). Определить количество дней в этом месяце для невисокосного года.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца ");
        int day = in.nextInt();
        switch (day){
            case 2:
                System.out.println("28");
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            default:
                System.out.println("ошибка");*/

        //Case15. Мастям игральных карт присвоены порядковые номера: 1 — пики,
        //2 — трефы, 3 — бубны, 4 — червы. Достоинству карт, старших десятки,
        //присвоены номера: 11 — валет, 12 — дама, 13 — король, 14 — туз. Даны
        //два целых числа: N — достоинство (6 ≤ N ≤ 14) и M — масть карты
        //(1 ≤ M ≤ 4). Вывести название соответствующей карты вида «шестерка
        //бубен», «дама червей», «туз треф» и т. п

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите достоинство карты число от 2 до 14");
        int rank = in.nextInt();
        System.out.println("Введите масть карты от 1 до 4");
        int suit = in.nextInt();
        switch(rank){
            case 2:
                System.out.print("двойка ");
                break;
            case 3:
                // и т.д.
        }

        switch(suit){
            case 1:
                System.out.println("пик");
                break;
            case 2:
                System.out.println("треф");
                break;
            case 3:
                System.out.println("бубей");
                break;
            case 4:
                System.out.println("червей");
                break;
            default:
                System.out.println("Ошибка в масти");*/
        //циклы
        /*for(int i=1; i<=10; i=i+1){
            System.out.println(i +" ");
        }*/


        //For1. Даны целые числа K(111) и N (5) (N > 0). Вывести число K N раз.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число ");
        int k = in.nextInt();
        System.out.print("Введите количество повторений ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i = i+1){
            System.out.println(k + "");
        }*/

        //For2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все
        //целые числа, расположенные между A и B (включая сами числа A и B), а
        //также количество N этих чисел.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число a ");
        int a = in.nextInt();
        System.out.print("Введите целое число b ");
        int b = in.nextInt();
        int result = 0;
        for(int i = a; a<b; i = i+1){
            System.out.println(i);
            result = result + 1;
        }
        System.out.println("\n"+result);*/

        //For4. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все
        //целые числа, расположенные между A и B (включая сами числа A и B), а
        //также количество N этих чисел.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите цену за кг конфет ");
        int a = in.nextInt();
        int b = 1;
        for (int i = a; a<10; i = b+1){
            System.out.println(a*b);
            int b=b+1;
        }*/

        //For5◦
        //. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,
        //0.2, . . . , 1 кг конфет.
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите цену за кг конфет ");
        double price = in.nextInt();
        for (double weight = 0.1; weight<1.1; weight = weight + 0.1){
            System.out.println(Math.round(weight*10)/10.0 + " кг стоит " + Math.round(price*weight*100)/100.0);
        }*/
        // for (int i=1; i<1= 10; i++){
        // Sout ((double)i/10.0 + "" + price*i/10)}

        //1 Составьте
        /*for (int i = 10; i<=20; i++){
            int i = i*i;
            System.out.print("Квадрат этого числа: " + i);
        }*/

        //Series6. Дано целое число N и набор из N положительных вещественных
        //чисел. Вывести в том же порядке дробные части всех чисел из данного набора (как вещественные числа с нулевой целой частью), а также
        //произведение всех дробных частей.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число N ");
        int n = in.nextInt();
        double pr = 1;
        for (int i = 1; i<=n; i++){
            double x = in.nextDouble();
            double drobn = x - (int)x;
            System.out.println("Дробная часть: " + drobn);
            pr = pr * drobn;
        }
        System.out.println("Произведение всех дробных частей: " + pr);*/

        //2. Составьте программу, котораЯ вычисляет сумму чисел от 1 до n.значение n вводится с клавиатуры.
        /*int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число n ");
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + 1;
        }
        System.out.println("Сумма чисел ");*/

        // 3. Составьте программу, составьте программу, которая вычисляет произведение чисел от 1 до n.n вводится с клавиатуры.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите число n ");
        int sum = 0;
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + 1;
        }
        System.out.println("Сумма чисел ");*/

        // 8. Даны натуральные числа от 20 до 50.Напечатать те из них, которые делятся на 3, но не делятся на 5.
        /*Scanner in = new Scanner(System.in);
        for (int i = 20; i <= 50; i++) {
            if (i % 3 == 0 && i % 5 != 0)
                System.out.println(i);
        }*/

        //9. даны натуральные числа от 35 до 87. Найти и напечатать те из них, которые при делении на 7 дают остаток 1, 2 или 5.
        /*Scanner in = new Scanner (System.in);
        for (int i = 35; i <=87; i++) {
            if (i%7==1||i%7==2||i%7==5)
                System.out.println(i);
        }*/

        //16. В бригаде, работающей на уборке сена, имеется N сенокосилок.
        // Первая сенокосилка работала m часов, а каждая следующая на 10 минут больше, чем предыдущая.
        // Сколько часов проработала вся бригада?
        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите количество сенокосилок: ");
        int n = in.nextInt();
        System.out.print("Введите кол-во часов, которое работала 1-я косилка ");
        int m = in.nextInt();
        int sum = 0;
        int workTimeInMin = m * 60;
        for (int i = 1; i <= n; i++) {
            sum += workTimeInMin;
            workTimeInMin +=10;
        }
        System.out.println("Время работы бригады " + sum/60 + "часов и " + sum % 60);*/


        //17. В ЭВМ вводятся по очереди данные о росте N учащихся класса. Определить средний рост учащихся класса.

        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите количество учащихся класса: ");
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.println("Введите рост ");
            int rost = in.nextInt();
            sum = sum + rost;
        }
        int sredn = sum/n;
        System.out.println("Средний рост учащихся " + sredn);*/


        //18. Задано натуральное число N.
        // Найти количество натуральных чисел,
        // не превосходящих N и не делящихся ни на одно из чисел 2,3,5.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = in.nextInt();
        int kol = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                kol += 1;
                System.out.println("число " + i);
            }
        }
        System.out.println("Количество чисел = " + kol);*/

        // 19. Два двузначных числа, записанных одно за другим ,
        // образуют четырёхзначное число, которое делится на их произведение.
        // Найти эти числа.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int n = in.nextInt();
        int kol = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                kol += 1;
                System.out.println("число " + i);
            }
        }
        System.out.println("Количество чисел = " + kol);*/

        //19.
        /*for (int x = 10; x<=99; x++) {
            for (int y = 10; y <= 99; y++) {
                int num = 100*x+y;
                if (num%(x*y)==0)
                    System.out.println(num);
            }
        }*/


        //20. даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа:
        // первое число получили путем написания сначала числа А, затем В.
        // Для получения второго числа сначала записали число В, затем А.
        // Найти числа А и В если известно , что первое четырехзначное число нацело делится на 99, а второе на 49.

        //21. Дано натуральное n. вычислить 1/(2 в квадрате) + 1/(4 в квадрате)+ ... + 1/(2n в квадрате) ( в квадрате только n)

        /*Scanner in=new Scanner(System.in);
        System.out.println("Введите натурально число:");
        int n = in.nextInt();
        double sum = 0;
        for (int i=2; i<=n;i+=2) {
            sum +=1.0/(i*i);
        }
        System.out.println(sum);*/


        //Цикл While

        // 28. Бизнессмен взял ссуду m тысяч рублей в банке под 20% годовых.
        // через сколько лет его долг превысит s тысяч рублей,
        // если за это время он не будет отдавать долг.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите начальную сумму ссуды ");
        int nach_summa = in.nextInt();
        int proc = 20;
        System.out.println("Введите сумму гарантии ");
        int s = in.nextInt();
        double dolg = nach_summa;
        int let = 0;
        while(dolg<=s){
            dolg = dolg * (1+proc/100.0);
            let++;
        }
        System.out.println("Через " + let + " лет");*/


        // человек начинает бежать с 1-го км. Каждую неделю он увеличивает км на 10%
        // Через сколько недель дистанция превысит 10 км.
        /*double dist = 1.0;
        int k=0;
        while (dist < 10.0001){
            dist*=1.1;
            k++;
        }
        System.out.println(k);*/

        //30. С помощью оператора while напишите программу определения
        // суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.

        /*int i=1;
        int sum=0;
        while(i<=99){
            sum+=i;
            i+=2;
        }*/

        //-------------------------------------------------------------------------------------
        //11.08.2022 Lesson 8

        // Повторять ввод, пока пользователь не введет число от 0 до 10
        /*int i;
        Scanner in = new Scanner (System.in);
        do {
            System.out.println("Введите целое число ");
            i = in.nextInt();
        }while(i<0||i>10);*/

        // !(i>=0 && i<=10) => !(i>=0) || !(i<=10)=> i<0|| i>10 правило Деморгона


        //МАССИВЫ!!!!

        /*final int size = 10;
        int[] mas = new int[size];
        int[] mas1 = {0,1,2,3,4,5,6,7,8,9};
        //заполнить массив случайными
        for(int i=0; i < mas.length; i++){
            mas[i] = (int)(Math.random()*10);
        }
        //вывод массива в строку
        for(int i=0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();*/


        //Array1. Дано целое число N (> 0). Сформировать и вывести целочисленный
        //массив размера N, содержащий N первых положительных нечетных чисел:
        //1, 3, 5, . . . .

        /*Scanner in = new Scanner(System.in);
        int size;
        do {
            System.out.println("Введите размер массива ");
            size=in.nextInt();
        }
        while (size<1);
        int[] arr = new int[size];
        int j=1;
        for(int i=0;i<arr.length;i++){
            arr[i] = j;
            j+=2;
            //arr[i]=2*i+1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();*/


        //Array2. Дано целое число N (> 0). Сформировать и вывести целочисленный
        //массив размера N, содержащий степени двойки от первой до N-й: 2, 4,
        //8, 16, . . . .

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size=in.nextInt();
        int[] arr = new int[size];
        int j=2;
        for(int i=0;i<arr.length;i++){
            arr[i] = j;
            j*=2;
            //arr[i]=2*i+1;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + "");
        }
        System.out.println();*/


        //Array3. Дано целое число N (> 1), а также первый член A и разность D арифметической прогрессии.
        // Сформировать и вывести массив размера N,
        // содержащий N первых членов данной прогрессии:
        //A+0*D, A + 1*D, A + 2·D, A + 3·D, . . . .

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size=in.nextInt();
        int[] arrifm = new int[size];
        int a=in.nextInt();
        int d=in.nextInt();
        arrifm[0]=a;
        for(int i=1;i<arrifm.length;i++){
            arrifm[i]=a+i*d;
        }
        //for(int i=0;i<arrifm.length;i++){
        //            arrifm[i]=a+i*d;
        for(int i=0;i<arrifm.length;i++){
            System.out.println(arrifm[i] + "");
        }
        System.out.println();*/

        //Array7◦
        //. Массив размера N заполнить случайными целыми числами. Вывести его элементы в прямом и обратном порядке.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива ");
        int size=in.nextInt();
        int[] arifm = new int[size];

        for(int i=1;i<arifm.length;i++){
            int a = (int)(Math.random()*10);
            arifm[i]=a;
        }
        for(int i=0;i<arifm.length;i++){
            System.out.println(arifm[i] + "");
        }
        System.out.println();

        for(int i=arifm.length-1;i>=0;i--) {
            System.out.println(arifm[i] + "");
        }*/

        //Array8. Массив размера N заполнить случайными целыми числами.
        // Вывести все содержащиеся в
        //данном массиве нечетные числа в порядке возрастания их индексов, а
        //также их количество K.

        /*Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size=in.nextInt();
        int[] arifm = new int[size];
        for(int i=1;i<arifm.length;i++){
            int a = (int)(Math.random()*10);
            arifm[i]=a;
        }
        System.out.println();
        int kolvo=0;
        for(int i=0;i<arifm.length;i++){
            System.out.println(arifm[i] + "");
        }
        System.out.println();

        for (int i=0;i<arifm.length;i++) {
            if (arifm[i] % 2 != 0) {
                System.out.println(arifm[i] + "");
                kolvo++;
            }
        }
        System.out.println("\nКоличество нечётных чисел: " + kolvo);*/


        //Array9. Дан целочисленный массив размера N.
        // Вывести все содержащиеся в
        //данном массиве четные числа в порядке убывания их индексов, а также
        //их количество K

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size=in.nextInt();
        int[] arifm = new int[size];
        for(int i=1;i<arifm.length;i++){
            int a = (int)(Math.random()*10);
            arifm[i]=a;
        }
        System.out.println();
        for (int i=0;i<arifm.length;i++) {
                System.out.println(arifm[i] + "");
        }
        System.out.println();

        System.out.println("Чётные числа: ");
        int k = 0;
        for (int i=0;i<arifm.length;i++) {
            if (arifm[arifm.length-1-i] % 2 == 0) {
                System.out.println(arifm[arifm.length-1-i] + "");
                k++;
            }
        }
        System.out.println("\nКоличество чётных чисел: " + k);




    }
}


















