public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public static void main(String []args)
    {

    }
    public void add(String element)
    {
        Node node = new Node(element);
        node.setPrevious(tail);/*El actual se lo setteo a la cola*/
        tail=node;


        if (head==null) /*Caso vacio*/
        {
            head=node;
        }else {
            node.getPrevious().setNext(node); /*Basicamente obtengo el nodo anterior
        y se lo doy al nodo actual de su anterior. Y me conecta el anterior con el actual*/

        }


        size++;
    }
    public void remove(int index)
    {
        if (index<0 || index>size) /*Caso en que el nodo a buscar este fuera del rango*/
        {

        }
        if (size==1) /*Caso de que sea solo un nodo*/
        {
            head=null;
            tail=null;
        }else if (index==0) /*En caso que este al inicio lo que se hace
        es tomar el siguiente y que este en la cabecera y el anterior de ese queda vacio*/
        {
           head=head.getNext();
           head.setPrevious(null);
        }else if(index == size -1)/*En caso de que sea el ultimo se le asigna a la cola y el siguiente
        queda vacio o nulo*/
        {
            tail = tail.getPrevious();
            tail.setNext(null);
        }else {

            Node nodeIterator = findNode(index);

            nodeIterator.getPrevious().setNext(nodeIterator.getNext());/*En esta parte
        obtengo el anterior y a este le pongo el siguiente del actual*/
            nodeIterator.getNext().setPrevious(nodeIterator.getPrevious()); /*A este obtengo
        el siguiente y a este le pongo el anterior del actual que estoy eliminando*/
        }
        size--;
    }

    private Node findNode(int index) { /*Metodo encargado de buscar un nodo*/
        Node nodeIterator=head;
        int i=0;
        while (i< index) /*Busca el nodo*/
        {
            nodeIterator=nodeIterator.getNext();/*asignacion de nodo*/
            i++;
        }
        return nodeIterator;
    }

    public void setAt(int index, String element)
    {
        Node node = findNode(index);
        node.setData(element);
    }
    public String getAt(int index,String data)
    {
        Node node=findNode(index);
        return node.getData();
    }

    public int size()
    {
        return size;
    }


}
