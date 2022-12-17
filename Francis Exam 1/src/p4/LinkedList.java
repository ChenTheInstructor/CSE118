package p4;


public class LinkedList<E> {
	private LinkedList<E> linkedList;
	public LinkedList() {
		super();
		linkedList = new LinkedList<E>();
	}
	
	public E remove(int index)
    {
        return linkedList.remove(index);
    }
	
	public int size() { 
		return linkedList.size(); 
	}
	
	public boolean add(E e)
    {
        return linkedList.add(e);
    }
	
}

