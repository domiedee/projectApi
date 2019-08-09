package apithree.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
class RestTesting implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate  = new RestTemplate();

        ResponseEntity<List<Movies>> response = restTemplate.exchange(
                "http://http://10.51.1.0:8080/comp/movies",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Movies>>(){});
        List<Movies> universities = response.getBody();

        for(Movies university : universities){
            System.out.println(university.toString());
        }

        System.err.println("Find One(GET)--------------------------------");

        Movies university = restTemplate.getForObject(
                "http://http://10.51.1.0:8080/comp/movies",
                Movies.class);
        System.out.println(university.toString());

        System.err.println("Creating(POST)______________________________");

        Movies newUniversity = new Movies((long) 4, "oteku","original",130);
        Movies createdUniversity = restTemplate.postForObject(
                "http://http://10.51.1.0:8080/comp/movies",
                newUniversity, Movies.class);
        System.out.println(createdUniversity.toString());

        System.err.println("____________________________________");
        String createCourseUrl = "http://http://10.51.1.0:8080/comp/movies"
                +createdUniversity.getId()+"/comp";

        Movies newCourse = new Movies();
        Movies createdCourse = restTemplate.postForObject(
                createCourseUrl,
                newCourse, Movies.class);
        System.out.println(createdCourse.toString());

    }
}
