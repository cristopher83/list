@startuml

 

title Lista - Class Diagram

 

class oop.collections.list.linkedlist.Node{
   - Node next;
   - Node previous;
   - String data;
}

 

class oop.collections.list.linkedlist.LinkedList {
  
    - Node head;
    - Node tail;
    
    
     + add(String element);
     + void remove(int index);
     + void setAt(int index, String element);
     + String getAt(int index);
     + size();
}

 

 

@enduml