package ua.aleksandr.ciklumhomework.Streams;

import org.apache.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

    static Logger log = Logger.getLogger(App.class.getName());

    public static void main(String[] args) throws IOException {
        //1 working with simple streams
        IntStream.range(1, 10).forEach(x -> log.info(x));

        //2
        IntStream.range(1, 10).skip(5).forEach(x -> log.info(x));

        //3
        log.info(IntStream.range(1, 5).sum());

        //4
        log.info("Stream of examples");
        Stream.of("koni","chifu","ckingwa").sorted().findFirst().ifPresent(x -> log.info(x));

        //5
        log.info("Stream of examples");
        String[] items = {"rolling", "on", "a", "mattress"};
        Stream.of(items).filter(x -> x.startsWith("m")).sorted().forEach(x -> log.info(x + " "));

        //6
        log.info("Arrays.stream numbers");
        Arrays.stream(new int[] {1, 3, 3, 7}).map(x -> x * x).average().ifPresent(n -> log.info("Present"));

        //7
        log.info("Arrays as list stream");
        List<String> list = Arrays.asList("Konan", "Itachi", "Hisame", "Sasori", "Deidara", "Kakuzu", "Hidan", "Orochimaru");
        list.stream().map(x -> x.toUpperCase()).sorted().forEach(x -> log.info(x));

        //8 working with files
        Stream<String> lines = Files.lines(Paths.get("src\\main\\resources\\files\\word-file"));
        log.info("Longer then 6");
        lines.sorted().filter(c -> c.length() > 6).forEach(x -> log.info(x + " "));

        //9
        lines = Files.lines(Paths.get("src\\main\\resources\\files\\word-file"));
        log.info("Conctains a");
        lines.sorted().filter(s -> s.contains("a")).collect(Collectors.toList()).forEach(x -> log.info(x + " "));

        //10
        lines = Files.lines(Paths.get("src\\main\\resources\\files\\stockDataCsv"));
        log.info("Count of word that are more then 3 char long - " + lines.map(x -> x.split(","))
                .filter(x -> x.length > 3).count());

        //11
        lines = Files.lines(Paths.get("src\\main\\resources\\files\\stockDataCsv"));
        lines.map(x -> x.split(",")).filter(x -> x.length > 3)
                .filter(x -> Integer.parseInt(x[1].trim()) > 15).forEach(x ->
                log.info(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
        lines.close();
    }
}
