package com.ece.sad;

public interface Taxi {
    void visit(NormalCustomer normalCustomer);
    void visit(DisabilityCustomer disabilityCustomer);
    void visit(CabCompany cabCompany);
}
