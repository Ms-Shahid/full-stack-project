package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Admin;

public interface IAdminService {

    public Admin saveAdmin(Admin admin);

    public List<Admin> getAllAdmins();

    public Admin getAdmin(Integer id);

    public void deleteAdmin(Integer id);

    public Admin updateAdmin(Integer id, Admin admin);

}
