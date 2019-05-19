package vu.lt.alternatives;

import java.util.concurrent.Future;

public interface IISBNGenerator {

    Future<Integer> generateISBN();
}
