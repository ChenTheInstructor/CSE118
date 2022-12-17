package p4;

public class Link<E>{
	    Link<E> nexE;
	    E data;
	    Link<E> next;
	    Link(E data)
	    {
	 
	        // This keyword refers to current object itself
	        this.data = data;
	        this.next = null;
	    }
}

