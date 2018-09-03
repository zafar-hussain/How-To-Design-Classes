public class TryCatch
{
    public static void main(String[] args)
    {

        try
        {
            assert 1 != 2 : "we fucked up";
            assert 3 == 2 : "fucked are we";
        } catch (Exception e)
        {
            System.out.println("FuckedRuS");
        }


    }
}
