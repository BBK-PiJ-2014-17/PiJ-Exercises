public class test {

    public static void main(String[] args) {
        Person ta = new TAImpl();
        System.out.println(ta.getName());
    }

}

interface Person {
    public default String getName() {
        return "Name";
    }
}

interface Academic extends Person {
    @Override
    public default String getName() {
        return "XXX";
    }
}

interface Student extends Person {
    //@Override
    //public default String getName() {
    //    return "XXX";
    //}
}
interface TeachingAssistant extends Academic, Student {
    @Override
    public default String getName() {
        return "XCX";
    }
}

class TAImpl implements TeachingAssistant {
    @Override
    public String getName() {
        return "Impl";
    }
}
