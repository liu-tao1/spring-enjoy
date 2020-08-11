package com.enjoy.example.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

/**
 * User 相关 Bean 的转换器
 *
 * @author liutao
 * @since 2020/8/11
 */
// 添加 @Mapper 注解，声明它是一个 MapStruct Mapper 映射器。
@Mapper
public interface UserConvert {

    // 通过调用 Mappers 的 #getMapper(Class<T> clazz) 方法，获得 MapStruct 帮我们自动生成的 UserConvert 实现类的对象
    UserConvert INSTANCE = Mappers.getMapper(UserConvert.class);

    UserBO convert(UserDO userDO);

    @Mappings({
            @Mapping(source = "userDO.id", target = "userId"),
            @Mapping(source = "username", target = "name")
    })
    UserDetailBO convertToDetail(UserDO userDO);

}
