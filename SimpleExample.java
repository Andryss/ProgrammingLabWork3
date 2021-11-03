//322005

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * После того как космонавты поужинали,
 * они покинули ракету ФИС и в организованном порядке перешли в ракету НИП.
 * Доктор Пилюлькин сказал, что в ракете НИП условия для проживания лучше,
 * поскольку там каждый может лечь спать в отдельной каюте, в то время как
 * на ракете ФИС все принуждены ютиться в одной двенадцатиместной кабине.
 * Правда, самому доктору Пилюлькину было удобнее следить за всяческими
 * нарушениями режима, когда все помещались в одной кабине, но ради общего
 * блага он решил поступиться личными удобствами.
 * @version 1.0
 * @author Krivosheev Andrey
 */
public class SimpleExample {
    public static void main(String[] args) {
        Shorty[] group = new Shorty[12];

        group[0] = new Normal("Незнайка");
        group[1] = new Normal("Знайка");
        group[2] = new Normal("Винтик");
        group[3] = new Normal("Шпунтик");
        group[4] = new Normal("Пулька");
        group[5] = new Normal("Тюбик");
        group[6] = new Normal("Гусля");
        group[7] = new Normal("Торопыжка");
        group[8] = new Normal("Ворчун");
        group[9] = new Normal("Пончик");
        Doctor doctor = new Doctor();
        group[10] = doctor;
        Cook cook = new Cook("Сиропчик");
        group[11] = cook;

        GroupOfShorties astronauts = new GroupOfShorties(group);

        PriorityQueue<Shorty> queue = new PriorityQueue<>(Comparator.comparingInt(Shorty::hashCode));

        FISRocket fisRocket = new FISRocket();
        NIPRocket nipRocket = new NIPRocket();

        astronauts.goTo(fisRocket);

        // Action start
        System.out.println("----Начало действий----\n");

        // "После того как космонавты поужинали, ...
        astronauts.haveDinner();

        // ... они покинули ракету ФИС ...
        astronauts.goOut();

        // ... и в организованном порядке перешли в ракету НИП. ...
        astronauts.goTo(nipRocket);

        // ... Доктор Пилюлькин сказал, что в ракете НИП условия для проживания лучше,
        // поскольку там каждый может лечь спать в отдельной каюте, в то время как
        // на ракете ФИС все принуждены ютиться в одной двенадцатиместной кабине.
        // Правда, самому доктору Пилюлькину было удобнее следить за всяческими
        // нарушениями режима, когда все помещались в одной кабине, но ради общего
        // блага он решил поступиться личными удобствами."
        doctor.analyzeRockets(fisRocket, nipRocket);
    }
}
