package org.myproject;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import objects.Customer;

import java.util.List;
import java.util.Map;

public class DataTableStepDefinition {

  @Given("my credentials")
    public void my_credentials(DataTable dataTable) {
        //List<String>  credentials=dataTable.values();
        List<String>  credentials=dataTable.row(0);
        IO.println("User name :"+credentials.get(0));
        IO.println("Password :"+credentials.get(1));
    }

 /*   @Given("my credentials")
    public void my_credentials(Customer customer) {
        IO.println("Username :"+customer.getUserName());
        IO.println("Password :"+customer.getPassWord());
    }*/

   /* @Given("my credentials for multiple rows")
    public void my_credentials_for_multiple_rows(DataTable dataTable) {
        List<List<String>> creds=dataTable.asLists();
        IO.println("Username row 0:"+creds.get(0).get(0));
        IO.println("Password row 0:"+creds.get(0).get(1));
        IO.println("Username row 1:"+creds.get(1).get(0));
        IO.println("Password row 1:"+creds.get(1).get(1));
    }*/

    @Given("my credentials for multiple rows")
    public void my_credentials_for_multiple_rows(List<List<String>> credentials) {
        IO.println("User name row 0:"+credentials.get(0).get(0));
        IO.println("Password row 0:"+credentials.get(0).get(1));
        IO.println("User name row 1:"+credentials.get(1).get(0));
        IO.println("Password row 1:"+credentials.get(1).get(1));
    }

   /* @Given("my credentials for multiple rows")
    public void my_credentials_for_multiple_rows(List<Customer> customers) {
        IO.println("Username row 0:"+customers.get(0).getUserName());
        IO.println("Password row 0:"+customers.get(0).getPassWord());
        IO.println("Username row 1:"+customers.get(1).getUserName());
        IO.println("Password row 1:"+customers.get(1).getPassWord());
    }*/

    @Given("my credentials for single row with header")
    public void my_credentials_for_single_row_with_header(DataTable dataTable) {
        List<Map<String,String>> maps =dataTable.asMaps();
        IO.println("User name :"+maps.getFirst().get("username"));
        IO.println("Password :"+maps.getFirst().get("password"));
    }

   /* @Given("my credentials for single row with header")
    public void my_credentials_for_single_row_with_header(Customer customer) {
        IO.println("Username :"+customer.getUserName());
        IO.println("Password :"+customer.getPassWord());
    }*/

    @Given("my credentials for single column with no header")
    public void my_credentials_for_single_column_with_no_header(DataTable dataTable) {
        List<String> credentials=dataTable.asList();
        IO.println("User name :"+credentials.get(0));
        IO.println("Password :"+credentials.get(1));
    }

    @Given("my credentials for single column with header")
    public void my_credentials_for_single_column_no_header(DataTable dataTable) {

        Map<String,String> map =dataTable.asMap();
        IO.println("User name :"+map.get("username"));
        IO.println("Password :"+map.get("password"));

    }

    @Given("my credentials for single column with multiple rows without header")
    public void my_credentials_for_single_column_with_multiple_rows_without_header(@Transpose Customer customer) {
        IO.println("User name :"+customer.getUserName());
        IO.println("Password :"+customer.getPassWord());
    }


}
