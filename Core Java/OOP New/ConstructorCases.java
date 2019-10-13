class ConstructorCases {
    ConstructorCases(){
        this(10);
        System.out.println("Inside no-arg constructor");
    }

    ConstructorCases(int i){
        this(20.6);
        System.out.println("Inside int-arg constructor");
    }

    ConstructorCases(double d){
        System.out.println("Inside double-arg constructor");
    }

    public static void main(String args[]) {
        ConstructorCases c1 = new ConstructorCases();
        ConstructorCases c2 = new ConstructorCases(10);
        ConstructorCases c3 = new ConstructorCases(10.5);
    }
}