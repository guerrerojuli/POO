package tp05.ej06;

public interface AccessStack<E> extends Stack<E>{
    int getPushAccesses();
    int getPopAccesses();
}
