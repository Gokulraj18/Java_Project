Interface Printables{
    void print();
} 
class Printer implements Printables{
    public void print(){
        System.out.println("Printer class");
    }
}