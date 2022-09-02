public class Node {
    private  Node next;
    private Node previous;
    private String data;

    public static void main(String []args)
    {

    }
        /*Funciones para variable next es un constructor y no tiene variable de regreso*/
    public Node(String data)
    {
        this.data=data;
    }
    public Node getNext()
    {
        return next;
    }
    public void setNext(Node next)
    {
        this.next= next;
    }
        /*Funciones para variable previous*/
    public Node getPrevious()
    {
        return  previous;
    }
    public void setPrevious(Node previous)
    {
        this.previous=previous;
    }
        /*Funciones para variable string data*/
    public String getData()
    {
        return data;
    }
    public void setData(String data)
    {
        this.data=data;
    }
}
