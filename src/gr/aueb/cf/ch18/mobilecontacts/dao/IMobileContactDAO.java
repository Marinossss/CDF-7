package gr.aueb.cf.ch18.mobilecontacts.dao;

import gr.aueb.cf.ch18.mobilecontacts.model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {
    MobileContact insert (MobileContact mobileContact);
    MobileContact update (Long id,MobileContact mobileContact);
    void deleteById (long id);
    void deleteByPhoneNumber(String phoneNumber);
    MobileContact getById (Long id);
    List<MobileContact> getAll();

    MobileContact getByPhoneNumber(String phoneNumber);
    boolean userIdExists(Long id);
    boolean phoneNumberExists(String phoneNumber);
}
