package dev.gnanaprakash.movie_catalog_service.resources;

import dev.gnanaprakash.movie_catalog_service.models.CatalogItem;
import dev.gnanaprakash.movie_catalog_service.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {

        List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 3));

        return ratings.stream().map(rating -> new CatalogItem("Name", "Desc", rating.getRating())).collect(Collectors.toList());
        // For each movie ID, call movie services and get details

        // Put them all together
    }
}
