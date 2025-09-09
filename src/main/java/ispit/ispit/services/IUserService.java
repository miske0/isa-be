package ispit.ispit.services;

import ispit.ispit.models.UserModel;
import ispit.ispit.models.UserPageModel;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IUserService {
    List<UserModel> findAll();
    UserPageModel findPagedList(PageRequest pageRequest);
    UserModel create(UserModel model);
}
