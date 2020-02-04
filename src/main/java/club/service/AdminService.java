package club.service;

import club.pojo.Admins;
import com.github.pagehelper.PageInfo;
/**
 * @author kang
 */
public interface AdminService {
    PageInfo<Admins> adminPage(String adminName,Integer pageNum,Integer pageSize);
    Admins findById(Integer id);
    Admins login(String adminName, String adminPwd);
    int add(Admins admins);
    int update(Admins admins);
    int del(Integer id);
}
