package in.org.cutm.quizbackend.Service;

import in.org.cutm.quizbackend.Entity.UserInfo;
import in.org.cutm.quizbackend.Repository.UserRepository;
import in.org.cutm.quizbackend.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository1){
        userRepository = userRepository1;
    }
    @Override
    public UserInfo saveUser(UserInfo userInfo) {
        return userRepository.save(userInfo);
    }

    @Override
    public List<UserInfo> getUserInfo() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Integer id) {
        Optional<UserInfo> userInfo = userRepository.findById(id);
        if(userInfo.isPresent()){
            userRepository.deleteById(id);
        }else{
            throw new ResourceNotFoundException("User","id",id);
        }
    }

    @Override
    public UserInfo updateUserInfo(UserInfo prevuserInfo, Integer id) {
        UserInfo userInfo = userRepository.findById(id).orElseThrow( () -> new ResourceNotFoundException("User","id",id));
        userInfo.setUserName(prevuserInfo.getUserName());
        userInfo.setPassword(prevuserInfo.getPassword());
        userInfo.setUemail(prevuserInfo.getUemail());
        userRepository.save(userInfo);
        return userInfo;
    }

    @Override
    public UserInfo getUserById(Integer id) {
       Optional<UserInfo> userInfo = userRepository.findById(id);
       if (userInfo.isPresent()){
           return userInfo.get();
       }else{
           throw new ResourceNotFoundException("User","id",id);
       }
    }
}
