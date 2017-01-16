package edu.nwpu.rjwdz.abstractfactory;

/**
 * Created by lovywinsy on 1/16/17.
 */
public class ActionMovieFactory implements IMovieFactory {
    @Override
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodActionMovie();
    }

    @Override
    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }
}