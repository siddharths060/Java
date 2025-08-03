public class MedicalStudent extends Student{
    // method study is overriding (run time polymorphism) base class method study
    @Override
    void study(){
        System.out.println("Medical Student is studying Anatomy!");
    }
}
