package edu.nwpu.rjwdz.abstractfactory;

/**
 * Created by lovywinsy on 1/16/17.
 */
public interface IMovieFactory {
    ITollywoodMovie getTollywoodMovie();

    IBollywoodMovie getBollywoodMovie();
}
