package in.org.cutm.quizbackend.Service;

import in.org.cutm.quizbackend.Entity.UserInfo;

import java.util.List;

public interface UserService {
    //save the user
    UserInfo saveUser(UserInfo userInfo);
// Get all the user list
    List<UserInfo> getUserInfo();
    //delete the user by id
    void deleteUser(Integer id);
    //UPdate the userinfo by id
    UserInfo updateUserInfo(UserInfo userInfo , Integer id);
     //get the user by id
    UserInfo getUserById(Integer id);

}
