package edu.nwpu.rjwdz.abstractfactory;

import org.junit.Test;

/**
 * Created by lovywinsy on 1/16/17.
 */
public class AbstractFactoryTest {
    @Test
    public void abstractFactoryEx() {
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
