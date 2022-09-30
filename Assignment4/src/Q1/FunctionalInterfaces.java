package Q1;

@FunctionalInterface
interface GreaterThan {
    public boolean Greater(int a, int b);
}

@FunctionalInterface
interface Increment {
    int incrementNum(int a);
}

@FunctionalInterface
interface ConcatenationString{
    String concatenate(String s1,String s2);
}

@FunctionalInterface
interface UpperCaseString{
    String upper(String s1);
}