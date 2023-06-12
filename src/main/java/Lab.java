
import java.util.*;


public class Lab {
    /**
     * Instantiate and return a List of Integers.
     *
     * List<Integer> list = new List<>(); is not valid code.
     * Two interesting things here: First, List is actually an interface, not a class: its only ability is to define
     * potential behavior, but it does not provide implementation code.
     *
     * Second, the <Integer> portion represents a Generic. Generics allow an object to contain any object of a certain
     * type, so we can create a List that contains Integers, Strings, or even other Lists. Why do we use Integer and
     * not int? Generics can only contain Objects, and not primitives, so we Integer because it is a Wrapper class,
     * the Object form of a primitive.
     *
     * A popular implementation of List is ArrayList. Look up how to instantiate one.
     *
     * @return a List<Integer> object.
     */
    public List<Integer> createList(){
        List<Integer> list = new ArrayList<>();
        return list;
    }

    public int getSize(List<Integer> list){
        return list.size();
    }


    public void addToList(List<Integer> list, int value){
        list.add(value);
    }

  
    public int get(List<Integer> list, int index){
        return list.get(index);
    }

  
    public void removeFromList(List<Integer> list, int position){
        list.remove(position);
    }

  
    public void updateAtPosition(List<Integer> list, int position, int value){
        list.set(position, value);
    }
}