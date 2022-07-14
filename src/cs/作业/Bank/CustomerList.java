package cs.作业.Bank;

public class CustomerList {
    private Customer[] customers;//用来保存客户对象数组
    private int total = 0;//记录已保存客户对象的数量

    public CustomerList(int totalCustomers) {
        this.customers = new Customer[totalCustomers];
        //初始化

    }

    /**
     * 添加
     *
     * @param customer
     * @return
     */
    public boolean addCustomer(Customer customer) {
        if (total > customers.length) {
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    /**
     * @param index
     * @param cust
     * @return
     */
    public boolean replaceCustomer(int index, Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * @return
     */

    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        customers[--total] = null;

        return true;
    }

    public Customer[] getAllCustomer() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }


    public Customer getCustomers(int index) {
        if (index < 0 || index >= total) {
            return null;
        }
        return customers[index];
    }


    public int getTotal() {

        return total;
    }


}
