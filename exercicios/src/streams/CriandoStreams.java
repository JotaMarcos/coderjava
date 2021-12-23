package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	public static void main(String[] args) {

		Consumer<String> print = System.out::print;
		Consumer<Integer> println = System.out::println;

		// Criando Streams
		Stream<String> langs = Stream.of("Java", " Lua ", "JS\n");
		langs.forEach(print);
		System.out.println("ииииииииииииииииииииииииииииииии");

		// Criando Streams
		String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
		Stream.of(maisLangs).forEach(print);
		System.out.println("ииииииииииииииииииииииииииииииии");

		// Criando Streams
		Arrays.stream(maisLangs).forEach(print);
		System.out.println("ииииииииииииииииииииииииииииииии");
		Arrays.stream(maisLangs, 1, 4).forEach(print);
		System.out.println("ииииииииииииииииииииииииииииииии");

		// Criando Streams
		List<String> outrasLangs = Arrays.asList("C ", "PH ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		System.out.println("ииииииииииииииииииииииииииииииии");
		outrasLangs.parallelStream().forEach(print);

		// Gerando Streams inifinita
		// Stream.generate(() -> "a").forEach(print);
		Stream.iterate(0, n -> n + 1).forEach(println);

	}
}
