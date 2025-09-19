public class DynamicArray<T> {

    private T[] data;

    private int size;

    private static final int INITIAL_CAPACITY = 10;

    @SuppressWarnings("unchecked")
    public DynamicArray() {

        data = (T[]) new Object[INITIAL_CAPACITY];

        size = 0;
    }

    // add
    public void add(T element) {
        // if full , go up size
        if (size == data.length) {
            resize();
        }
        // add element
        data[size] = element;

        size++;
    }

    // get
    public T get(int index) {
        // check index
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        // return index
        return data[index];
    }

    // remove
    public T remove(int index) {
        // check index
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        // lưu lại phần tử bị xóa để trả về
        T removedElement = data[index];

        // sort right to left
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        // end of element set null to avoid memory leakp
        data[size - 1] = null;

        // - element
        size--;

        return removedElement;
    }

    // size
    public int size() {
        return size;
    }

    // resize
    @SuppressWarnings("unchecked")
    private void resize() {
        // double capicity
        T[] newData = (T[]) new Object[data.length * 2];

        // copy from old to new array
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        // data=new array
        data = newData;
    }
}
