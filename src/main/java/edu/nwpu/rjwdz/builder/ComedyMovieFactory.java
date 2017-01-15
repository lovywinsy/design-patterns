package edu.nwpu.rjwdz.builder;

/**
 * Created by lovywinsy on 2017/1/15.
 */
public class ComedyMovieFactory implements IMovieFactory {
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodComedyMovie();
    }

    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
