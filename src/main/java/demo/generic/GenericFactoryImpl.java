package demo.generic;

/**
 *
 * @param <N>
 * @param <T>
 */
public class GenericFactoryImpl<N,T> implements GenericIFactory<T, N> {
    @Override
    public T nextObject() {
        return null;
    }

    @Override
    public N nextNumber() {
        return null;
    }
}
