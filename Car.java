import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class Car {
    private String carId;
    private String carbrand;
    private String carModel;
    private  String carBasePricePerDay;
    private  boolean isavialabe;
    public Car(String carId, String carbrand, String carModel, String carBasePricePerDay,boolean isavialabe){
        this.carId=carId;
        this.carbrand=carbrand;
        this.carModel=carModel;
        this.carBasePricePerDay=carBasePricePerDay;
        
          
    }
    public String getcarId(){
        return carId;
      }
      public String getCarbrand(){
       return carbrand;
      }
      public String getcarMode(){
        return carModel;
      }
      public String getcarBasePricePerDay(){
         return carBasePricePerDay;
      }
      public double calculatePrice(int days){
        return carBasePricePerDay+rent;
      }
      public boolean isavialabe(){
        return isavialabe;
      }
      public void rent(){
        isavialabe=false;
      }
      public void returnCar(){
        isavialabe=true;
      }
       
    class Customer{
       private String CustomerId;
       private String CustomerName;
       private String CustomerAddress;
       public Customer(String CustomerId,String CustomerName,String CustomerAddress){
        this.CustomerId=CustomerId;
        this.CustomerName=CustomerName;
        this.CustomerAddress=CustomerAddress;
       }
       public String getCustomerId(){
        return CustomerId;

       }
       public String getCustomerName(){
        return CustomerName;
       }
       public String getCustomerAddress(){
        return CustomerAddress;
       }
    }
    class rent{
      private Car car;
      private Customer customer;
      private int days;
      public rent(Car car,Customer customer, int  days ){
        this.car=car;
        this.customer=customer;
        this.days=days;
       

      }
      public Car getCar(){
        return car;
      }
      public Customer gCustomer(){
        return customer;
      }
      public int getdays(){
        return days;
      }
    }
    class CarRentalSystem{
      private List<Car> cars;
      private List<Customer> customers;
      private List <rent> rentals;
      public CarRentalSystem(){
        cars=new ArrayList<>();
        customers=new ArrayList<>();
        rentals =new ArrayList<>();
      }
      public void Addcar(Car car){
         Addcar(car);
      }
      public void Addcustomer(Customer customer){
        Addcustomer(customer);
      }
      public void RentCar(Car car, Customer customer, int days){
       if(car.isavialabe()){
        car.rent()
       }
      }
    }
  }
