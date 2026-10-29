import java.util.*;
class Stack{
    private int[] arr;
    private int top;
    private int capacity;
    Stack(int size){
        capacity=size;
        arr=new int[size];
        top=-1;
    }
    boolean isFull(){
        return(top==arr.length-1);
    }
    boolean isEmpty(){
        return(top==-1);
    }
    void Push(int x){
        try{
            if(isFull()){
                throw new StackOverflowError("Can not push" + x);
            }
            top++;
            arr[top]=x;
            System.out.println("Pushed:"+x);
        }
        catch(StackOverflowError e){
            System.out.println("OverFlow"+e);
        }
    }
    //pop method 
    void pop(){
        try{
            if(isEmpty()){
                throw new EmptyStackException();//error occuring in this section
            }
           int popvalue=arr[top];
           top--;
           System.out.println("The popped element is:"+popvalue);
           
        }
        catch(EmptyStackException e){
            System.out.println("Stack is empty "+ e);
        }
    }
}