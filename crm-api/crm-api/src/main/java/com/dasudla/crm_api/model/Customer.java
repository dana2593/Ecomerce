package com.dasudla.crm_api.model;

import java.util.Set;

public class Customer extends Person {
    private String customerCode;
    private String taxId;
    private TaxIdType taxIdType;
    private CustomerType customerType;
    private Set<SaleOrder> saleOrders;

    public Customer() {}

    public Customer(String customerCode, String taxId, TaxIdType taxIdType, CustomerType customerType, Set<SaleOrder> saleOrders) {
        this.customerCode = customerCode;
        this.taxId = taxId;
        this.taxIdType = taxIdType;
        this.customerType = customerType;
        this.saleOrders = saleOrders;
    }

    public String getCustomerCode() { return customerCode; }
    public void setCustomerCode(String customerCode) { this.customerCode = customerCode; }

    public String getTaxId() { return taxId; }
    public void setTaxId(String taxId) { this.taxId = taxId; }

    public TaxIdType getTaxIdType() { return taxIdType; }
    public void setTaxIdType(TaxIdType taxIdType) { this.taxIdType = taxIdType; }

    public CustomerType getCustomerType() { return customerType; }
    public void setCustomerType(CustomerType customerType) { this.customerType = customerType; }

    public Set<SaleOrder> getSaleOrders() { return saleOrders; }
    public void setSaleOrders(Set<SaleOrder> saleOrders) { this.saleOrders = saleOrders; }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", taxId='" + taxId + '\'' +
                ", taxIdType=" + taxIdType +
                ", customerType=" + customerType +
                '}';
    }
}
