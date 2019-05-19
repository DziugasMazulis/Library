package vu.lt.alternatives;

import org.apache.deltaspike.core.api.future.Futureable;
import vu.lt.services.ISBNGenerator;

import javax.ejb.AsyncResult;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;
import java.io.Serializable;
import java.util.concurrent.Future;

@ApplicationScoped
@Alternative
public class ISBNGeneratorAlt extends ISBNGenerator implements Serializable  {

    @Futureable
    public Future<Integer> generateISBN() {
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        final Integer ISBN = -1;
        return new AsyncResult<>(ISBN);
    }
}
