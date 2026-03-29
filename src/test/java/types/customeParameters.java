package types;

import io.cucumber.java.DataTableType;
import io.cucumber.java.ParameterType;
import objects.Application;
import objects.Customer;

import java.util.List;
import java.util.Map;

public class customeParameters {

    @ParameterType(".*")
    public Application application(String applicationType)
    {
        return new Application(applicationType);
    }

  /*  @DataTableType
    public Customer customerEntry(List<String> entry)
    {
        return new Customer(entry.get(0),entry.get(1));
    }*/

   /* @DataTableType
    public Customer customerEntryMap(Map<String,String> map)
    {
        return new Customer(map.get("username"),map.get("password"));
    }*/


     @DataTableType
    public Customer customerEntry(List<String> entry)
    {
        return new Customer(entry.get(0),entry.get(1));
    }

}
