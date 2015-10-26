package tutorial.com.felix.tutorial;

import java.util.List;
import java.util.Objects;

/**
 * Created by felix on 10/26/2015.
 */
public class Tuple<P, S> {
    private P m1;
    private S m2;

    public Tuple(P m1, S m2){
        this.m1 = m1;
        this.m2 = m2;
    }

    public P getPrimary(){
        return this.m1;
    }

    public S getSecondary(){
        return this.m2;
    }
}
