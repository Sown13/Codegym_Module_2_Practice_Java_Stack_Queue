import java.util.Comparator;

public class Customer {

    private int id;
    private String name;


    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object)
    {
        boolean sameSame = false;

        if (object != null && object instanceof Customer)
        {
            sameSame = this.id == ((Customer) object).id && this.name == ((Customer) object).name;
        }

        return sameSame;
    }
}