class MyGenericClass<T>
{
    T obj;
    void add(T obj){
    this.obj=obj;
    }
    
    T get(){
        return obj;
    }
}



public class task3 {
    public static void main(String[] args) {
        MyGenericClass <Integer> a= new MyGenericClass();
        a.add(10);
        MyGenericClass <String> b= new MyGenericClass();
        b.add("omkar jadhav");

        System.out.println(a.get());
        System.out.println(b.get());
    }
}
