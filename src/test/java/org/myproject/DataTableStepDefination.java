package org.myproject;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Given;
import objects.Customer;

import java.util.List;
import java.util.Map;

public class DataTableStepDefination {

  @Given("my creditials")
    public void my_creditials(DataTable dataTable) {
        //List<String>  creds=dataTable.values();
        List<String>  creds=dataTable.row(0);
        System.out.println("User name :"+creds.get(0));
        System.out.println("Password :"+creds.get(1));
    }

 /*   @Given("my creditials")
    public void my_creditials(Customer customer) {
        System.out.println("User name :"+customer.getUserName());
        System.out.println("Password :"+customer.getPassWord());
    }*/

   /* @Given("my creditials for multiple rows")
    public void my_creditials_for_multiple_rows(DataTable dataTable) {
        List<List<String>> creds=dataTable.asLists();
        System.out.println("User name row 0:"+creds.get(0).get(0));
        System.out.println("Password row 0:"+creds.get(0).get(1));
        System.out.println("User name row 1:"+creds.get(1).get(0));
        System.out.println("Password row 1:"+creds.get(1).get(1));
    }*/

    @Given("my creditials for multiple rows")
    public void my_creditials_for_multiple_rows(List<List<String>> creds) {
        System.out.println("User name row 0:"+creds.get(0).get(0));
        System.out.println("Password row 0:"+creds.get(0).get(1));
        System.out.println("User name row 1:"+creds.get(1).get(0));
        System.out.println("Password row 1:"+creds.get(1).get(1));
    }

   /* @Given("my creditials for multiple rows")
    public void my_creditials_for_multiple_rows(List<Customer> customers) {
        System.out.println("User name row 0:"+customers.get(0).getUserName());
        System.out.println("Password row 0:"+customers.get(0).getPassWord());
        System.out.println("User name row 1:"+customers.get(1).getUserName());
        System.out.println("Password row 1:"+customers.get(1).getPassWord());
    }*/

    @Given("my creditials for single row with header")
    public void my_creditials_for_single_row_with_header(DataTable dataTable) {
        List<Map<String,String>> maps =dataTable.asMaps();
        System.out.println("User name :"+maps.get(0).get("username"));
        System.out.println("Password :"+maps.get(0).get("password"));
    }

   /* @Given("my creditials for single row with header")
    public void my_creditials_for_single_row_with_header(Customer customer) {
        System.out.println("User name :"+customer.getUserName());
        System.out.println("Password :"+customer.getPassWord());
    }*/

    @Given("my creditials for single column with no header")
    public void my_creditials_for_single_column_with_no_header(DataTable dataTable) {
        List<String> creds=dataTable.asList();
        System.out.println("User name :"+creds.get(0));
        System.out.println("Password :"+creds.get(1));
    }

    @Given("my creditials for single column with header")
    public void my_creditials_for_single_column_no_header(DataTable dataTable) {

        Map<String,String> map =dataTable.asMap();
        System.out.println("User name :"+map.get("username"));
        System.out.println("Password :"+map.get("password"));

    }

    @Given("my creditials for single column with multiple rows without header")
    public void my_creditials_for_single_column_with_multiple_rows_without_header(@Transpose Customer customer) {
        System.out.println("User name :"+customer.getUserName());
        System.out.println("Password :"+customer.getPassWord());
    }


}
