package vu.lt.services;

import org.apache.deltaspike.core.api.future.Futureable;

import javax.ejb.AsyncResult;
import javax.enterprise.context.ApplicationScoped;
import java.io.Serializable;
import java.util.Random;
import java.util.concurrent.Future;

@ApplicationScoped
public class ISBNGenerator implements Serializable {

    @Futureable
    public Future<Integer> generateISBN(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        final Integer ISBN = new Random().nextInt(9999);
        return new AsyncResult<>(ISBN);
    }
}
