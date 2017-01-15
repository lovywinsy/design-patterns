package edu.nwpu.rjwdz.builder;

import org.junit.Test;

/**
 * Created by lovywinsy on 2017/1/15.
 */
public class BuilderTest {
    @Test
    public void builderEx() {
        System.out.println("This is a builder pattern demo");
        ActionMovieFactory actionMovies = new ActionMovieFactory();
        ITollywoodMovie tAction = actionMovies.getTollywoodMovie();
        IBollywoodMovie bAction = actionMovies.getBollywoodMovie();
        System.out.println("Action movies are:");
        System.out.println(tAction.movieName());
        System.out.println(bAction.movieName());

        ComedyMovieFactory comedyMovies = new ComedyMovieFactory();
        ITollywoodMovie tComedy = comedyMovies.getTollywoodMovie();
        IBollywoodMovie bComedy = comedyMovies.getBollywoodMovie();
        System.out.println("Comedy movies are:");
        System.out.println(tComedy.movieName());
        System.out.println(bComedy.movieName());
    }
}
