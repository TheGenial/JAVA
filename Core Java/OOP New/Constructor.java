//When we create an object compulsary we should perform initialization of object
//When create object some piece of code will execute that is constructor
//Constructor is for perform initialization of object, not to create an object
//available access modifier for constructor is public, private, protected & default

class Constructor {

    static int count = 0;
    String name;
    int rollNo;

    {
        count++;
    }

    Constructor() {
        System.out.println("Inside empty constructor");
    }

    Constructor(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String args[]) {
        Constructor s1 = new Constructor();
        Constructor s2 = new Constructor("Arif",101);
        Constructor s3 = new Constructor("Kaif",202);

        System.out.println(s2.name);
        System.out.println(s2.name);
        System.out.println("Number of object created:"+count);
    }
}