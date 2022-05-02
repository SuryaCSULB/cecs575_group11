import java.util.*;

interface Department
{
	ArrayList<Product> returnproducts();
	
}

class Fashion implements Department
{
	int id;
	String Name;
	ArrayList<Product> p;
	Fashion(int id,String Name,ArrayList<Product> p)
	{
		this.id=id;
		this.Name=Name;
		this.p=p;
	}
	public ArrayList<Product> returnproducts()
	{
		return p;
	}
	
}

class Electronics implements Department
{
	int id;
	String Name;
	ArrayList<Product> p;
	Electronics(int id,String Name,ArrayList<Product> p)
	{
		this.id=id;
		this.Name=Name;
		this.p=p;
	}
	public ArrayList<Product> returnproducts()
	{
		return p;
	}
	
}

class HeadDepartment implements Department {
    private Integer id;
    private String name;

    private List<Department> childDepartments;

    public HeadDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

   public void addDepartment(Department department) {
        childDepartments.add(department);
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    public ArrayList<Product> returnproducts() {
		for (Department d : childDepartments) 
		{
			return d.returnproducts();
		}
		return null;
			
	}
}

public class CompositeTest {
	ArrayList<Product> products,products1;
	void test()
	{
	Product P1=new Product(1,"Leather Jacket",68.99);
	Product P2=new Product(2,"Jeans",29.99);
	products=new ArrayList<Product>();
	products.add(P1);
	products.add(P2);
	Department fashion = new Fashion(1, "Fashion",products);
	Product P3=new Product(1,"Bluetooth Speaker",99.99);
	Product P4=new Product(2,"Laptop",699.99);
	products1=new ArrayList<Product>();
	products1.add(P3);
	products1.add(P4);
    Department electronics = new Electronics(2, "Electronics",products1);
    HeadDepartment headDepartment = new HeadDepartment(3, "Head department");
    headDepartment.addDepartment(fashion);
	headDepartment.addDepartment(electronics);
	}
}
