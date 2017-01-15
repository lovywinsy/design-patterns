package edu.nwpu.rjwdz.builder;

/**
 * Created by lovywinsy on 2017/1/15.
 */
public class ActionMovieFactory implements IMovieFactory {
    public ITollywoodMovie getTollywoodMovie() {
        return new TollywoodActionMovie();
    }

    public IBollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}
