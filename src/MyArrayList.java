import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 * Created by Denis Starovoitenko on 06.08.2017.
 */
public class MyArrayList<E> extends ArrayList<E> {
    public MyArrayList(int initialCapacity) {
        super(initialCapacity);
    }

    public MyArrayList() {
    }

    public MyArrayList(Collection<? extends E> c) {
        super(c);
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("remove(index)");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("remove(Object)");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("removeRange(from, to)");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("removeAll(Collection)");
    }

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        throw new UnsupportedOperationException("removeIf(Predicate)");
    }
}
