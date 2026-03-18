public class Facade {
    public static void main(String[] args) {
        FacadeRestaurant restaurant = new FacadeRestaurant();
        restaurant.order();
        restaurant.pay();
    }
}

class FacadeRestaurant{
    private Chef chef = new Chef();
    private Staff staff = new Staff();
    private Manager manager = new Manager();
    void order(){
        staff.order();
        chef.cook();
    }
    void pay(){
        staff.invoice();
        manager.feedback();
        manager.complainChef();
    }
}

class Chef{
    public void cook(){
        System.out.println("Nhận order từ bồi bàn");
        System.out.println("Nấu món ăn");
    }
}

class Staff{
    public void order(){
        System.out.println("Order món ăn cho khách");
    }
    public void invoice(){
        System.out.println("Gửi hóa đơn cho khách");
    }
}

class Manager{
    public void feedback(){
        System.out.println("Lấy ý kiến khách hàng");
    }
    public void complainChef(){
        System.out.println("Lấy ý kiến đầu bếp");
    }
}

