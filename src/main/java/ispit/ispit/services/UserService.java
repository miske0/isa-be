package ispit.ispit.services;

import ispit.ispit.mappers.UserMapper;
import ispit.ispit.models.UserModel;
import ispit.ispit.repositories.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {
    private final IUserRepository userRepository;
    @Override
    public List<UserModel> findAll(){
        var result = userRepository.findAll();
        return UserMapper.toModelList(result);
    }

    @Override
    public UserModel create(UserModel model) {
        var entity = UserMapper.toEntity(model);

        var result = userRepository.save(entity);

        return UserMapper.toModel(result);
    }


}
