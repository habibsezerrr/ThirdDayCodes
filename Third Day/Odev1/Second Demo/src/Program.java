class Program {

    public static void main(String[] args) {
/*
        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer();

        customer.id = 1;
        customer.city = "İzmir";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Delete();
        customerManager.Save();

        Company company = new Company();
        company.taxNumber = "102030";
        company.CompanyName = "Vestel";
        company.id = 2121;

        Person person = new Person();
        person.nationalIdentity = "302010";

        CustomerManager customerManager1 = new CustomerManager(new Person());

        Customer c1 = new Customer();
        Customer c2 = new Person(); // inheritance sayesinde yaptık
        Customer c3 = new Company();
*/

        CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.GiveCredit();
    }
}

class CreditManager {

    public void Calculate() {
        System.out.println("Hesaplandı...");
    }

    public void Save() {
        System.out.println("Kredi verildi...");
    }
}

interface ICreditManager {
    void Calculate();
    void Save();
}

abstract class BaseCreditManager implements ICreditManager{
    @Override
    public abstract void Calculate();

    @Override
    public void Save() {

        System.out.println("Kaydedildi...");
    }
}

class TeacherCreditManager implements ICreditManager {

    @Override
    public void Calculate() {
        //Öğretmen kredisine ait bazı hesaplamalar yapıldı
        System.out.println("Öğretmen Kredisi Hesaplandı...");
    }

    @Override
    public void Save() {

    }
}

class MilitaryCreditManager implements ICreditManager {

    @Override
    public void Calculate() {
        System.out.println("Asker Kredisi Hesaplandı...");
    }

    @Override
    public void Save() {

    }
}

class Customer {

    public int id;
    public String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class Company extends Customer {

    public String taxNumber;
    public String CompanyName;

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }
}

class Person extends Customer {

    public String nationalIdentity;
    public String firstName;
    public String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
}

//Katmanlı Mimariler (Her class farklı iş yapar ve bunun ayrımını yapmak katmanlı mimaridir.)
class CustomerManager {

    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager (Customer customer, ICreditManager creditManager) {
    /*
    parametre olarak gönerilen interface, diğer 2 class'ın referansı tutabiliyor

    ICreditManager creditManager yazmamıza rağmen başka biçimde(teacher-milatary) de
    kullanabildiğimiz için bu bir polymorphism örneğidir
    */

        _customer = customer;
        _creditManager = creditManager;
    }

    public void Save() {

        System.out.println("Müşteri Kaydedildi: ");
    }

    public void Delete() {

        System.out.println("Müşteri Silindi: ");
    }

    public void GiveCredit() {
        _creditManager.Calculate();
        System.out.println("Kredi verildi...");
    }
}
