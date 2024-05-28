public class FacadeEx
{
    public static void main(String[] args)
    {
        HotleServiceStaff hotleServiceStaff=new HotleServiceStaff();

        System.out.println("Veg Menu");
        hotleServiceStaff.showVegMenu();

        System.out.println("--------");
        System.out.println("Non Veg Menu");
        hotleServiceStaff.showNonVegMenu();

        System.out.println("--------");
        System.out.println("Veg & Non Veg Menu");
        hotleServiceStaff.showVegNonVegMenu();
    }
}