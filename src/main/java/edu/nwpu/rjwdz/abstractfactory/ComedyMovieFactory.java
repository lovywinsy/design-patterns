package edu.nwpu.rjwdz.abstractfactory;

/**
 * Created by lovywinsy on 1/16/17.
 */
public class ComedyMovieFactory implements IMovieFactory {
    @Override
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodComedyMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}
