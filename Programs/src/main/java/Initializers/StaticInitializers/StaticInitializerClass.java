package Initializers.StaticInitializers;


class StaticInitializerClass
{

    static{
        System.out.println("Static Initializer block");
    }

    StaticInitializerClass()
    {
        System.out.println("Constructor Called");
    }
    public static void main(String[] args)
    {
//        StaticInitializerClass a = new StaticInitializerClass();
    }
}