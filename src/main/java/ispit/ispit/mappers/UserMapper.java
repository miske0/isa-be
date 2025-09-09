package ispit.ispit.mappers;

import ispit.ispit.entities.User;
import ispit.ispit.models.UserModel;
import ispit.ispit.models.UserPageModel;

import java.util.ArrayList;
import java.util.List;

public class UserMapper {

    public static User toEntity(UserModel model){}

    public static UserModel toModel(User entity){
        return UserModel.builder()
                .id(entity.getId())
                .email(entity.getEmail())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName()).build();
    }

    public static List<UserModel> toModelList(List<User> entites){
        var list = new ArrayList<UserModel>();
        for (var entity : entites){
            list.add(toModel(entity));
        }
        return list;
    }

    public static UserPageModel toModelPagedList(Page<User> pageEntity){

    }


}
