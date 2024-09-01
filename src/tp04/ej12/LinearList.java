package tp04.ej12;

public interface LinearList {
    /**
     * Agrega un elemento al final de la lista.
     */
    void add(Object obj);

    /**
     * Obtiene el i-ésimo elemento de la lista.
     */
    Object get(int i);

    /**
     * Modifica el i-ésimo elemento de la lista colocando un nuevo valor.
     */
    void set(int i, Object obj);

    /**
     * Elimina el i-ésimo elemento de la lista.
     */
    void remove(int i);

    /**
     * Busca el índice de la primer ocurrencia de un objeto en la lista.
     */
    int indexOf(Object obj);

    /**
     * Retorna el tamaño de la lista.
     */
    int size();
}
