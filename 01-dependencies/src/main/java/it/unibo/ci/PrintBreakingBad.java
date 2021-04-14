package it.unibo.ci;
import com.uwetrottmann.thetvdb.TheTvdb;
import org.apache.commons.io.IOUtils;
import retrofit2.Response;
import java.io.IOException;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import static java.nio.charset.StandardCharsets.UTF_8;
import static org.jooq.lambda.Unchecked.intFunction;

public final class PrintBreakingBad {

    private PrintBreakingBad() { }

    public static void main(String... args) throws IOException {
        final TheTvdb api = new TheTvdb(IOUtils.toString(ClassLoader.getSystemResource("APIKey"), UTF_8));
        Optional.of(api.search().series("Breaking Bad", null, null, null, "it").execute())
            .filter(Response::isSuccessful)
            .flatMap(response -> response.body().data.stream().findFirst())
            .stream()
            .flatMap(serie -> // Every serie becomes a stream of pages
                IntStream.iterate(1, it -> it + 1)
                    .mapToObj(intFunction(page -> api.series().episodes(serie.id, page, "it").execute()))
                    .takeWhile(Response::isSuccessful)
            )
            .flatMap(it -> it.body().data.stream()) // every page becomes a stream of episodes
            .map(it -> it.episodeName)
            .filter(Objects::nonNull)
            .forEach(System.out::println);
        System.exit(0);
    }
}
