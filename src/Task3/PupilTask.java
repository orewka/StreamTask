package Task3;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.text.html.HTMLDocument;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PupilTask {
    public static void main(String[] args) {
        Pupil pupil1 = new Pupil(1,"Александр", Pupil.Gender.MALE , LocalDate.of(1989,2,2));
        Pupil pupil2 = new Pupil(2,"Вика", Pupil.Gender.FEMALE , LocalDate.of(1990,3,3));
        Pupil pupil3 = new Pupil(3,"Алексей", Pupil.Gender.MALE , LocalDate.of(1991,4,4));
        Pupil pupil4 = new Pupil(4,"Алена", Pupil.Gender.FEMALE , LocalDate.of(1992,5,5));
        Pupil pupil5 = new Pupil(5,"Дарья", Pupil.Gender.FEMALE , LocalDate.of(1993,6,6));
        Pupil pupil6 = new Pupil(6,"Сергей", Pupil.Gender.MALE , LocalDate.of(1994,7,7));
        Pupil pupil7 = new Pupil(7,"Анна", Pupil.Gender.FEMALE , LocalDate.of(1995,8,8));
        Pupil pupil8 = new Pupil(8,"Ханна", Pupil.Gender.FEMALE , LocalDate.of(1995,8,8));
        Pupil pupil9 = new Pupil(9,"Анна", Pupil.Gender.FEMALE , LocalDate.of(1995,8,10));
        Stream<Pupil> pupilStream = Stream.of(pupil1,pupil2,pupil3,pupil4,pupil5,pupil6,pupil7,pupil8,pupil9);
        // Используя Stream API:

        // 1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Pupil.Gender, ArrayList<Pupil>>
        // Map<Pupil.Gender, ArrayList<Pupil>> map1 =
        //        pupilStream.collect(Collectors.groupingBy(Pupil::getGender,Collectors.toCollection(ArrayList::new)));
        // System.out.println(map1);
        // 2. Найти средний возраст учеников
        // Long a = pupilStream.collect(Collectors.averagingInt(n-> (int) ChronoUnit.YEARS.between(n.getBirth(),LocalDate.now()))).longValue();
        // System.out.println(a);
        // 3. Найти самого младшего ученика
        // Pupil pupil3t =
        // pupilStream.min((n1, n2)->n2.getBirth().compareTo(n1.getBirth())).get();
        // System.out.println(pupil3t);
        // 4. Найти самого старшего ученика
        //Pupil pupil4t =
        //pupilStream.max(Comparator.comparing(n -> ChronoUnit.YEARS.between(n.getBirth(), LocalDate.now()))).get();
        //System.out.println(pupil4t);
        // 5. Собрать учеников в группы по году рождения
        // Map<Integer, List<Pupil>> map5 =
        //        pupilStream.collect(Collectors.groupingBy(n->n.getBirth().getYear(), Collectors.toList()));
        // System.out.println(map5);
        // 6. Убрать учеников с одинаковыми именами, имена и дату рождения оставшихся вывести в консоль
        // 7. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (List)
        // pupilStream.sorted(Comparator.comparing(Pupil::getGender).thenComparing(Pupil::getBirth)
        //        .thenComparing((n1,n2)->n2.getName().compareTo(n1.getName())))
        //        .collect(Collectors.toList())
        //        .forEach(System.out::println);
        // 8. Вывести в косоль всех учеников в возрасте от N до M лет
        //pupilStream.filter(n->ChronoUnit.YEARS.between(n.getBirth(),LocalDate.now()) >= 24 &&
        //        ChronoUnit.YEARS.between(n.getBirth(),LocalDate.now()) <= 26)
        //        .forEach(System.out::println);
        // 9. Собрать в список всех учеников с именем=someName
        //List<Pupil> list9 =
        //pupilStream.filter(n->n.getName().equals("Анна"))
        //        .collect(Collectors.toList());
        //System.out.println(list9);
        // 10. Собрать Map<Pupil.Gender, Integer>, где Pupil.Gender - пол, Integer - суммарный возраст учеников данного пола
        //Map<Pupil.Gender, Integer> map10 =
        //        pupilStream.collect(Collectors.groupingBy(Pupil::getGender,
        //                Collectors.summingInt(n->Period.between(n.getBirth(), LocalDate.now()).getYears())));
        //System.out.println(map10);
    }
}
